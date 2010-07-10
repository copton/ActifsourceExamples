package com.actifsource.complexservice.template;

import java.util.List;

/* Begin Protected Region [[88a36b35-8c69-11df-a65f-fd4c167633ca,imports]] */

/* End Protected Region   [[88a36b35-8c69-11df-a65f-fd4c167633ca,imports]] */

@SuppressWarnings("unused")
public class CallImpl {

  /* Begin Protected Region [[88a36b35-8c69-11df-a65f-fd4c167633ca]] */
  
  /* End Protected Region   [[88a36b35-8c69-11df-a65f-fd4c167633ca]] */

  public static class CallFunctions {

    private CallFunctions() {}

    public static java.lang.String className(final com.actifsource.complexservice.generic.javamodel.ICall call) {
      /* Begin Protected Region [[8e96b3d0-8c69-11df-a65f-fd4c167633ca]] */
      return String.valueOf(call.selectName() + "Impl");
      /* End Protected Region   [[8e96b3d0-8c69-11df-a65f-fd4c167633ca]] */
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,88a36b35-8c69-11df-a65f-fd4c167633ca] */
