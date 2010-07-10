package com.actifsource.complexservice.generic.javamodel;

import java.util.List;
import java.util.Map;
import ch.actifsource.util.collection.IMultiMapOrdered;

@SuppressWarnings("unused")
public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.Resource CLASS = new ch.actifsource.core.Resource("cef48b92-8c66-11df-a65f-fd4c167633ca");

  // relations
  
  public List<? extends com.actifsource.complexservice.generic.javamodel.IParameter> selectParameter();
  
  public com.actifsource.complexservice.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cef48b92-8c66-11df-a65f-fd4c167633ca,true] */
