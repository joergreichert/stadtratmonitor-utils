package de.oklab.leipzig.oparl.model.parser

import java.io.File
import javax.xml.parsers.SAXParserFactory

class Main {

    def static void main(String[] args) {
        val factory = SAXParserFactory.newInstance
        val saxParser = factory.newSAXParser
        val handler = new OParlHandler
        saxParser.parse(new File("input/input.xml"),
            handler);
        println(handler.entities)
    }
}