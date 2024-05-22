package com.bmw.quarkus.microservices.number;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;


import java.time.Instant;
import java.util.Random;

@Path("/api/numbers")
@Tag(name = "Number Rest API")
public class NumberResource {

    @Inject
    Logger log;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Generate ISBN numbers",
    description = "Generate ISBN numbers in both 10 and 13 formats")
    public Response generateIsbnNumbers(){

       IsbnNumbers isbnNumbers = IsbnNumbers.builder()
               .isbn10("10-:" + new Random().nextInt(100_000))
               .isbn13("13-:" + new Random().nextInt(100_000_000))
               .generatedDate(Instant.now())
               .build();

        log.info("Generated ISBN numbers: " + isbnNumbers);


        return Response.status(200).entity(isbnNumbers).build();
    }
}
