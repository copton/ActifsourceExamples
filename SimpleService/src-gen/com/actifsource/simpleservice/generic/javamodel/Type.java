package com.actifsource.simpleservice.generic.javamodel;

import java.util.List;
import java.util.Map;
import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@SuppressWarnings("unused")
@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Type extends DynamicActifsourceResource implements IType {

  private java.lang.String fName;
  
  public Type() {}
  
  public Type(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return fName;
  }
    
  public void setName(java.lang.String name) {
    fName = name;
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, "3169f49a-f91f-11d9-bb45-5fabdff7c7da");
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6671ec6f-8b2f-11df-b449-ffd07f85dbbb,true,6671ec6f-8b2f-11df-b449-ffd07f85dbbb] */
