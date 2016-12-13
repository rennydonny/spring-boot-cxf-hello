package com.home.demo.spring.boot.cxf.hello.rest;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by renny on 12/13/16.
 */
@Service
@Path("/sayHello")
public interface HelloService {

    @GET
    @Path("/{a}")
    @Produces(MediaType.APPLICATION_JSON)
    String sayHello(@PathParam("a") String a);
}
