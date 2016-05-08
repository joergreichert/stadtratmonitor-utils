package de.oklab.leipzig.oparl.model.parser;

import de.oklab.leipzig.oparl.model.parser.Entity;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Entities {
  private List<Entity> entities = CollectionLiterals.<Entity>newArrayList();
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package oparl");
    _builder.newLine();
    _builder.newLine();
    String _join = IterableExtensions.join(this.entities, "\n\n");
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Pure
  public List<Entity> getEntities() {
    return this.entities;
  }
  
  public void setEntities(final List<Entity> entities) {
    this.entities = entities;
  }
}
