package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @Inject
    @ConfigProperty(name="greeting")
    String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greeting;
    }

    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public Person greetPerson() {
        return new Person("JD", 77);
    }

}