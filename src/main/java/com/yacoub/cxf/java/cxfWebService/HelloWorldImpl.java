
package com.yacoub.cxf.java.cxfWebService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.yacoub.cxf.java.cxfWebService.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

