package com.kenard.unipds.quarkus.ai.agencia.resource;

import com.kenard.unipds.quarkus.ai.agencia.service.PackageExpert;
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

    @Inject
    PackageExpert packageExpert;

    @POST
    @Path("/assistant")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String ask(String question) {
        return assistant.chat(question);
    }

    @POST
    @Path("/expert")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String askExpert(String question) {
        return packageExpert.chat("session-123", question);
    }
}
