package com.bmw.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number Microservice",
                version = "1.0.0",
                description = "Number Microservice API",
                contact = @Contact(
                        name = "BMW",
                        email = "pieter.reyneke@bmwithub.co.za")),
        externalDocs = @ExternalDocumentation(
                description = "All Code",
                url = "https://github.com/PieterReynekeZAHub/quarkus-tutorial-1"

        ),
        tags = {
                @Tag(name = "api", description = "Public API that can be used by anybody"),
                @Tag(name = "numbers", description = "Anybody interested in numbers")
        }
)
public class NumberMicroService extends Application {
}
