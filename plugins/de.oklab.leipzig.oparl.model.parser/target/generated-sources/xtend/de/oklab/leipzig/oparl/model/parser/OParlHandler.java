package de.oklab.leipzig.oparl.model.parser;

import com.google.common.base.Objects;
import de.oklab.leipzig.oparl.model.parser.Attribute;
import de.oklab.leipzig.oparl.model.parser.Entities;
import de.oklab.leipzig.oparl.model.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@SuppressWarnings("all")
public class OParlHandler extends DefaultHandler {
  private boolean attributeValue = false;
  
  private boolean foundHeader = false;
  
  private boolean foundTocNumber = false;
  
  private boolean foundSpanStart = false;
  
  private boolean foundSpanEnd = false;
  
  private boolean foundSpan = false;
  
  private boolean foundTitle = false;
  
  private boolean foundTable = false;
  
  private boolean foundFirstCol = false;
  
  private boolean foundRow = false;
  
  private boolean foundCol = false;
  
  private boolean foundSpanTable = false;
  
  private boolean foundSpanFirstCol = false;
  
  private boolean foundSpanRow = false;
  
  private boolean foundSpanCol = false;
  
  private boolean foundThirdCol = false;
  
  private boolean foundPotColEnd = false;
  
  private final ArrayList<String> headers = CollectionLiterals.<String>newArrayList();
  
  @Accessors
  private final Entities entities = new Entities();
  
  private Entity entity = null;
  
  private Attribute attribute = null;
  
  @Override
  public void startDocument() {
    InputOutput.<String>println("Document starts.");
  }
  
  @Override
  public void startElement(final String namespaceURI, final String localName, final String qName, final Attributes atts) {
    if ((Objects.equal(qName, "a") && Objects.equal(atts.getValue("class"), "attribute-value"))) {
      this.attributeValue = true;
    }
    if (this.foundHeader) {
      if ((Objects.equal(qName, "span") && (atts.getLength() == 0))) {
        this.foundTocNumber = true;
      }
      if ((Objects.equal(qName, "span") && Objects.equal(atts.getValue("class"), "end-tag"))) {
        this.foundHeader = false;
        this.foundSpanEnd = true;
      }
    }
    if (this.foundSpanEnd) {
      if ((Objects.equal(qName, "span") && (atts.getLength() == 0))) {
        this.foundSpanEnd = false;
        this.foundHeader = false;
        this.foundSpan = true;
      }
    }
    if (this.foundTitle) {
      if (this.foundFirstCol) {
        if ((Objects.equal(qName, "span") && (atts.getLength() == 0))) {
          this.foundSpanFirstCol = true;
        }
      } else {
        if (this.foundRow) {
          if ((Objects.equal(qName, "span") && (atts.getLength() == 0))) {
            this.foundSpanRow = true;
          }
        } else {
          if (this.foundCol) {
            if ((Objects.equal(qName, "span") && (atts.getLength() == 0))) {
              this.foundSpanCol = true;
            }
          } else {
            if (this.foundTable) {
              if ((Objects.equal(qName, "span") && (atts.getLength() == 0))) {
                this.foundSpanTable = true;
              }
            }
          }
        }
      }
      if (((this.foundThirdCol && Objects.equal(qName, "span")) && Objects.equal(atts.getValue("class"), "end-tag"))) {
        this.foundPotColEnd = true;
      }
      if ((Objects.equal(qName, "span") && Objects.equal(atts.getValue("class"), "start-tag"))) {
        this.foundSpanStart = true;
      }
    }
  }
  
  @Override
  public void characters(final char[] ch, final int start, final int length) throws SAXException {
    if (this.foundTocNumber) {
      this.foundTocNumber = false;
      if ((length > 1)) {
        String _join = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
        CharSequence _subSequence = _join.subSequence(start, (start + length));
        String _plus = ("toc: " + _subSequence);
        InputOutput.<String>println(_plus);
      }
    }
    if (this.attributeValue) {
      String _join_1 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_1 = _join_1.subSequence(start, (start + length));
      boolean _equals = Objects.equal(_subSequence_1, "header-section-number");
      if (_equals) {
        this.attributeValue = false;
        this.foundHeader = true;
      }
    }
    if (this.foundSpan) {
      this.foundSpan = false;
      String _join_2 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_2 = _join_2.subSequence(start, (start + length));
      String _string = _subSequence_2.toString();
      this.headers.add(_string);
      String _join_3 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_3 = _join_3.subSequence(start, (start + length));
      final String entityName = _subSequence_3.toString();
      InputOutput.<String>println(("localName: " + entityName));
      Entity _entity = new Entity();
      final Procedure1<Entity> _function = (Entity it) -> {
        it.setName(entityName);
      };
      Entity _doubleArrow = ObjectExtensions.<Entity>operator_doubleArrow(_entity, _function);
      this.entity = _doubleArrow;
      List<Entity> _entities = this.entities.getEntities();
      _entities.add(this.entity);
      this.foundTitle = true;
    }
    if ((this.foundTitle && this.foundSpanStart)) {
      String _join_4 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_4 = _join_4.subSequence(start, (start + length));
      boolean _equals_1 = Objects.equal(_subSequence_4, "table");
      if (_equals_1) {
        this.foundSpanStart = false;
        this.foundTable = true;
      }
      String _join_5 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_5 = _join_5.subSequence(start, (start + length));
      boolean _equals_2 = Objects.equal(_subSequence_5, "code");
      if (_equals_2) {
        this.foundSpanStart = false;
        this.foundFirstCol = true;
      }
      String _join_6 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_6 = _join_6.subSequence(start, (start + length));
      boolean _equals_3 = Objects.equal(_subSequence_6, "tr");
      if (_equals_3) {
        this.foundSpanStart = false;
        this.foundRow = true;
      }
      String _join_7 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_7 = _join_7.subSequence(start, (start + length));
      boolean _equals_4 = Objects.equal(_subSequence_7, "td");
      if (_equals_4) {
        this.foundSpanStart = false;
        this.foundCol = true;
      }
    }
    if ((this.foundTable && this.foundSpanFirstCol)) {
      this.foundFirstCol = false;
      this.foundSpanFirstCol = false;
      String _join_8 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      final CharSequence content = _join_8.subSequence(start, (start + length));
      if (((content.toString().trim().length() > 1) && (!content.toString().startsWith("oparl:")))) {
        String _join_9 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
        CharSequence _subSequence_8 = _join_9.subSequence(start, (start + length));
        final String attributeName = _subSequence_8.toString();
        InputOutput.<String>println(("attributeName: " + attributeName));
        Attribute _attribute = new Attribute();
        final Procedure1<Attribute> _function_1 = (Attribute it) -> {
          it.setName(attributeName);
        };
        Attribute _doubleArrow_1 = ObjectExtensions.<Attribute>operator_doubleArrow(_attribute, _function_1);
        this.attribute = _doubleArrow_1;
        List<Attribute> _attributes = this.entity.getAttributes();
        _attributes.add(this.attribute);
      }
    }
    if ((this.foundTable && this.foundSpanRow)) {
      this.foundRow = false;
      this.foundSpanRow = false;
      String _join_10 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      final CharSequence content_1 = _join_10.subSequence(start, (start + length));
      if (((content_1.toString().trim().length() > 1) && (!content_1.toString().startsWith("oparl:")))) {
        String _join_11 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
        CharSequence _subSequence_9 = _join_11.subSequence(start, (start + length));
        final String attributeTypeName = _subSequence_9.toString();
        InputOutput.<String>println(("attributeTypeName: " + attributeTypeName));
        this.attribute.setType(attributeTypeName);
      }
    }
    if ((this.foundTable && this.foundSpanCol)) {
      this.foundCol = false;
      this.foundSpanCol = false;
      this.foundThirdCol = true;
      String _join_12 = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ch)));
      CharSequence _subSequence_10 = _join_12.subSequence(start, (start + length));
      final String documentation = _subSequence_10.toString();
      if (((documentation.trim().length() > 1) && (!documentation.startsWith("oparl:")))) {
        InputOutput.<String>println(("documentation: " + documentation));
        this.attribute.setType(documentation);
      }
    }
  }
  
  @Override
  public void endDocument() {
    InputOutput.<String>println("Document ends.");
  }
  
  @Pure
  public Entities getEntities() {
    return this.entities;
  }
}
