package com.kenard.unipds.quarkus.ai.agencia.service.resource;

import com.kenard.unipds.quarkus.ai.agencia.service.TravelAgenteAssistant;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("travel")
public class TravelAgenteResource {

    @Inject
    TravelAgenteAssistant assistant;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String ask(String question) {
        return assistant.chat(question);
    }
}
