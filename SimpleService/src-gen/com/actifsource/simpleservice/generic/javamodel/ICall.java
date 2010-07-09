package com.actifsource.simpleservice.generic.javamodel;

import java.util.List;
import java.util.Map;
import ch.actifsource.util.collection.IMultiMapOrdered;

@SuppressWarnings("unused")
public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.Resource CLASS = new ch.actifsource.core.Resource("64e13a40-8b2f-11df-b449-ffd07f85dbbb");

  // relations
  
  public List<? extends com.actifsource.simpleservice.generic.javamodel.IParameter> selectParameter();
  
  public com.actifsource.simpleservice.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,64e13a40-8b2f-11df-b449-ffd07f85dbbb,true] */
