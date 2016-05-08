package de.oklab.leipzig.oparl.model.parser;

import de.oklab.leipzig.oparl.model.parser.Entities;
import de.oklab.leipzig.oparl.model.parser.OParlHandler;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    try {
      final SAXParserFactory factory = SAXParserFactory.newInstance();
      final SAXParser saxParser = factory.newSAXParser();
      final OParlHandler handler = new OParlHandler();
      File _file = new File("input/input.xml");
      saxParser.parse(_file, handler);
      Entities _entities = handler.getEntities();
      InputOutput.<Entities>println(_entities);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
