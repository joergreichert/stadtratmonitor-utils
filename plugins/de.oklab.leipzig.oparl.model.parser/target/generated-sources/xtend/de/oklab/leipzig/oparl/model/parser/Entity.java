package de.oklab.leipzig.oparl.model.parser;

import de.oklab.leipzig.oparl.model.parser.Attribute;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Entity {
  private String name;
  
  private List<Attribute> attributes = CollectionLiterals.<Attribute>newArrayList();
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    _builder.append(this.name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _join = IterableExtensions.join(this.attributes, "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public List<Attribute> getAttributes() {
    return this.attributes;
  }
  
  public void setAttributes(final List<Attribute> attributes) {
    this.attributes = attributes;
  }
}
