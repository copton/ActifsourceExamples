package com.actifsource.simpleservice.generic.javamodel;

import java.util.List;
import java.util.Map;
import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@SuppressWarnings("unused")
@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Parameter extends DynamicActifsourceResource implements IParameter {

  private java.lang.String fName;
  
  public Parameter() {}
  
  public Parameter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
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
  public com.actifsource.simpleservice.generic.javamodel.IType selectType() {
    return _getSingle(com.actifsource.simpleservice.generic.javamodel.IType.class, "37f913d1-8b4c-11df-abce-ffdcfaccc0b3");
  }
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, "3169f49a-f91f-11d9-bb45-5fabdff7c7da");
  }
  
  // toMeRelations
  
  public static List<com.actifsource.simpleservice.generic.javamodel.IParameter> selectToMeType(com.actifsource.simpleservice.generic.javamodel.IType object) {
    return _getToMeList(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IParameter.class, "37f913d1-8b4c-11df-abce-ffdcfaccc0b3", object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,61e33c71-8b2f-11df-b449-ffd07f85dbbb,true,61e33c71-8b2f-11df-b449-ffd07f85dbbb] */
