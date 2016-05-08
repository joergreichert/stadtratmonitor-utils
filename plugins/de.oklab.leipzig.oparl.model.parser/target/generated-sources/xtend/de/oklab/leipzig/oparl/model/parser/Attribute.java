package de.oklab.leipzig.oparl.model.parser;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Attribute {
  private String name;
  
  private String type;
  
  private String documentation;
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/** ");
    _builder.append(this.documentation, "");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    _builder.append(this.type, "");
    _builder.append(" ");
    _builder.append(this.name, "");
    _builder.newLineIfNotEmpty();
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
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  @Pure
  public String getDocumentation() {
    return this.documentation;
  }
  
  public void setDocumentation(final String documentation) {
    this.documentation = documentation;
  }
}
