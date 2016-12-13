package com.home.demo.spring.boot.cxf.hello.rest.impl;

import com.home.demo.spring.boot.cxf.hello.rest.HelloService;
import io.swagger.annotations.Api;

/**
 * Created by renny on 12/13/16.
 */
@Api("/sayHello")
public class HelloServiceImpl implements HelloService {

    private String template="Hello %s to CXF RS Spring Boot World";

    @Override
    public String sayHello(String a) {
        return String.format(template,a);
    }
}
