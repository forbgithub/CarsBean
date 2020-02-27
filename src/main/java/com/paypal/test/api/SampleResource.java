package com.paypal.test.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

@Path("/sampleresource")
public interface SampleResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/hello")
    Response sayHello();
}
