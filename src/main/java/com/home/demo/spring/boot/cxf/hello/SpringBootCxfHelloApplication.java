package com.home.demo.spring.boot.cxf.hello;

import com.home.demo.spring.boot.cxf.hello.rest.impl.HelloServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootCxfHelloApplication {
	/*@Autowired
	private Bus bus;*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCxfHelloApplication.class, args);
	}

	/*public Server rsServer(){
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setBus(bus);
		endpoint.setAddress("/");
		// Register 2 JAX-RS root resources supporting "/sayHello/{id}" and "/sayHello2/{id}" relative paths
		endpoint.setServiceBeans(Arrays.<Object>asList(new HelloServiceImpl()));
		endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
		return endpoint.create();
	}*/
}
