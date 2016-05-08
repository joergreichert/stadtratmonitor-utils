package de.oklab.leipzig.oparl.model.parser

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.xml.sax.Attributes
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler

class OParlHandler extends DefaultHandler {
	var boolean attributeValue = false
	var boolean foundHeader = false
	var boolean foundTocNumber = false
	var boolean foundSpanStart = false
	var boolean foundSpanEnd = false
	var boolean foundSpan = false
	var boolean foundTitle = false
	var boolean foundTable = false
	var boolean foundFirstCol = false
	var boolean foundRow = false
	var boolean foundCol = false
	var boolean foundSpanTable = false
	var boolean foundSpanFirstCol = false
	var boolean foundSpanRow = false
	var boolean foundSpanCol = false
	var boolean foundThirdCol = false
	var boolean foundPotColEnd = false
	val headers = <String>newArrayList
	
	@Accessors
	val entities = new Entities
	var Entity entity = null
	var Attribute attribute = null

	override startDocument() {
		println("Document starts.")
	}

	override startElement(String namespaceURI, String localName, String qName, Attributes atts) {
		if (qName == "a" && atts.getValue("class") == "attribute-value") {
			attributeValue = true
		}
		if (foundHeader) {
			if (qName == "span" && atts.length == 0) {
				foundTocNumber = true
			}
			if (qName == "span" && atts.getValue("class") == "end-tag") {
				foundHeader = false
				foundSpanEnd = true
			}
		}
		if (foundSpanEnd) {
			if (qName == "span" && atts.length == 0) {
				foundSpanEnd = false
				foundHeader = false
				foundSpan = true
			}
		}
		if (foundTitle) {

			if (foundFirstCol) {
				if (qName == "span" && atts.length == 0) {
					foundSpanFirstCol = true
				}
			} else if (foundRow) {
				if (qName == "span" && atts.length == 0) {
					foundSpanRow = true
				}
			} else if (foundCol) {
				if (qName == "span" && atts.length == 0) {
					foundSpanCol = true
				}
			} else if (foundTable) {
				if (qName == "span" && atts.length == 0) {
					foundSpanTable = true
				}
			}
			if (foundThirdCol && qName == "span" && atts.getValue("class") == "end-tag") {
				foundPotColEnd = true
			}

			if (qName == "span" && atts.getValue("class") == "start-tag") {
				foundSpanStart = true
			}
		}
	}

	override characters(char[] ch, int start, int length) throws SAXException {
		if (foundTocNumber) {
			foundTocNumber = false
			if (length > 1) {
				println("toc: " + ch.join.subSequence(start, start + length));
			}
		}
		if (attributeValue) {
			if (ch.join.subSequence(start, start + length) == "header-section-number") {
				attributeValue = false
				foundHeader = true
			}
		}
		if (foundSpan) {
			foundSpan = false
			headers.add(ch.join.subSequence(start, start + length).toString)
			val entityName = ch.join.subSequence(start, start + length).toString
			println("localName: " + entityName);
			entity = new Entity => [ name = entityName ]
			entities.entities += entity
			foundTitle = true
		}
		if (foundTitle && foundSpanStart) {
			if (ch.join.subSequence(start, start + length) == "table") {
				foundSpanStart = false
				foundTable = true
			}
			if (ch.join.subSequence(start, start + length) == "code") {
				foundSpanStart = false
				foundFirstCol = true
			}
			if (ch.join.subSequence(start, start + length) == "tr") {
				foundSpanStart = false
				foundRow = true
			}
			if (ch.join.subSequence(start, start + length) == "td") {
				foundSpanStart = false
				foundCol = true
			}
		}
		if (foundTable && foundSpanFirstCol) {
			foundFirstCol = false
			foundSpanFirstCol = false
			val content = ch.join.subSequence(start, start + length)
			if (content.toString.trim.length > 1 && !content.toString.startsWith("oparl:")) {
				val attributeName = ch.join.subSequence(start, start + length).toString 
				println("attributeName: " + attributeName);
				attribute = new Attribute => [ name = attributeName ]
				entity.attributes += attribute
			}
		}
		if (foundTable && foundSpanRow) {
			foundRow = false
			foundSpanRow = false
			val content = ch.join.subSequence(start, start + length)
			if (content.toString.trim.length > 1 && !content.toString.startsWith("oparl:")) {
				val attributeTypeName = ch.join.subSequence(start, start + length).toString 
				println("attributeTypeName: " + attributeTypeName);
				attribute.type = attributeTypeName
			}
		}
		if (foundTable && foundSpanCol) {
			foundCol = false
			foundSpanCol = false
			foundThirdCol = true
			val documentation = ch.join.subSequence(start, start + length).toString
			if (documentation.trim.length > 1 && !documentation.startsWith("oparl:")) {
				println("documentation: " + documentation);
				attribute.type = documentation
			}
		}
//        if(foundThirdCol) {
//            val content = ch.join.subSequence(start, start + length)
//            println("att3_sub: " + content);
//        }
//        if(foundPotColEnd) {
//            val content = ch.join.subSequence(start, start + length)
//            if(content == "td") {
//                foundThirdCol = false
//                foundPotColEnd = false
//            }
//        }
	}

	override endDocument() {
		println("Document ends.")
	}
}

@Accessors
class Entities {
	List<Entity> entities = newArrayList
	
	override toString() '''
		package oparl
		
		«entities.join("\n\n")»
	'''
}

@Accessors
class Entity {
	String name
	List<Attribute> attributes = newArrayList
	
	override toString() '''
		class «name» {
			«attributes.join("\n")»
		}
	'''
}

@Accessors
class Attribute {
	String name
	String type
	String documentation
	
	override toString() '''
	/** «documentation» */
	«type» «name»
	'''
}
