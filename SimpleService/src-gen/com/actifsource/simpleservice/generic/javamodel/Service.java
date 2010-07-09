package com.actifsource.simpleservice.generic.javamodel;

import java.util.List;
import java.util.Map;
import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@SuppressWarnings("unused")
@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Service extends DynamicActifsourceResource implements IService {

  private java.lang.String fName;
  
  public Service() {}
  
  public Service(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
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
  public List<? extends com.actifsource.simpleservice.generic.javamodel.ICall> selectCall() {
    return _getList(com.actifsource.simpleservice.generic.javamodel.ICall.class, "9eb5f0b7-8b37-11df-accf-7b0339714ec3");
  }
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, "3169f49a-f91f-11d9-bb45-5fabdff7c7da");
  }
  
  // toMeRelations
  
  public static com.actifsource.simpleservice.generic.javamodel.IService selectToMeCall(com.actifsource.simpleservice.generic.javamodel.ICall object) {
    return _getToMeSingle(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IService.class, "9eb5f0b7-8b37-11df-accf-7b0339714ec3", object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f9fdc12-8b2f-11df-b449-ffd07f85dbbb,true,5f9fdc12-8b2f-11df-b449-ffd07f85dbbb] */
