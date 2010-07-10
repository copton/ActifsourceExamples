package com.actifsource.complexservice.template;

import java.util.List;

/* Begin Protected Region [[931633f3-8c67-11df-a65f-fd4c167633ca,imports]] */

/* End Protected Region   [[931633f3-8c67-11df-a65f-fd4c167633ca,imports]] */

@SuppressWarnings("unused")
public class ServiceImpl {

  /* Begin Protected Region [[931633f3-8c67-11df-a65f-fd4c167633ca]] */
  
  /* End Protected Region   [[931633f3-8c67-11df-a65f-fd4c167633ca]] */

  public static class ServiceFunctions {

    private ServiceFunctions() {}

    public static java.lang.String className(final com.actifsource.complexservice.generic.javamodel.IService service) {
      /* Begin Protected Region [[6a4e7c6e-8c68-11df-a65f-fd4c167633ca]] */
      return String.valueOf(service.selectName() + "Impl");
      /* End Protected Region   [[6a4e7c6e-8c68-11df-a65f-fd4c167633ca]] */
    }

  }

  public static class CallFunctions {

    private CallFunctions() {}

    public static java.lang.String memberName(final com.actifsource.complexservice.generic.javamodel.ICall call) {
      /* Begin Protected Region [[4c294807-8c6a-11df-a65f-fd4c167633ca]] */
      return String.valueOf(ch.actifsource.core.dynamic.Helper.forNonNull(call.selectName(), new ch.actifsource.core.dynamic.Helper.ICall<java.lang.String, java.lang.String>(){ public java.lang.String execute(java.lang.String item) { return ch.actifsource.template.BuiltIn.StringLiteralFunctions.toFirstLower(item); }}) + "Call");
      /* End Protected Region   [[4c294807-8c6a-11df-a65f-fd4c167633ca]] */
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,931633f3-8c67-11df-a65f-fd4c167633ca] */
