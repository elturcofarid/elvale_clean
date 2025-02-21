package com.onlysystem.elvale.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("El Vale API")
                        .version("1.0")
                        .description("API Documentation for El Vale application")
                        .contact(new Contact()
                                .name("OnlySystem")
                                .email("contact@onlysystem.com")));
    }
}