package com.sujeetpoc.springbootfeatures.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

/**
 * This configuration provides bean for OPEN-API swagger documentation
 */
@Configuration
public class OpenApiConfig {

	@Bean
	OpenAPI springBootFeaturesOpenApi() {
		return new OpenAPI().info(new Info().title("Sprting Boot Features POC")
				.description("This is POC app for Spring boot features which uses Spring Boot 3, Java 17")
				.version("1.0").contact(new Contact().email("")));
	}
}
