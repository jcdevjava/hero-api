/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.jcpalma.hero.api.services;

import dev.jcpalma.hero.api.models.Ping;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jcpalma
 */
@Path("/")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class PingService {
    
    private static final Ping ping = new Ping();
    
    @GET
    public Response getPing(){
        return Response
                .ok(ping)
                .build();
    }

}
