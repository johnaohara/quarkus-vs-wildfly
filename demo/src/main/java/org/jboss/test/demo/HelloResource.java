package org.jboss.test.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello from RESTEasy";
    }
}