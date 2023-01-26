package org.acme;


import io.smallrye.common.annotation.NonBlocking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/hello-nb")
public class GreetingResourceNB {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @NonBlocking
    public String hello() {
        return "Hello from RESTEasy";
    }
}