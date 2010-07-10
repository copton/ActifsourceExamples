package com.actifsource.complexservice.generic.javamodel;

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
  public List<? extends com.actifsource.complexservice.generic.javamodel.ICall> selectCall() {
    return _getList(com.actifsource.complexservice.generic.javamodel.ICall.class, "e1733215-8c66-11df-a65f-fd4c167633ca");
  }
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, "3169f49a-f91f-11d9-bb45-5fabdff7c7da");
  }
  
  // toMeRelations
  
  public static com.actifsource.complexservice.generic.javamodel.IService selectToMeCall(com.actifsource.complexservice.generic.javamodel.ICall object) {
    return _getToMeSingle(object.getRepository(), com.actifsource.complexservice.generic.javamodel.IService.class, "e1733215-8c66-11df-a65f-fd4c167633ca", object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cdce33f3-8c66-11df-a65f-fd4c167633ca,true,cdce33f3-8c66-11df-a65f-fd4c167633ca] */
