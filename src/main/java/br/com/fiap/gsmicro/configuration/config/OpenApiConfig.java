package br.com.fiap.gsmicro.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().components(new Components())
				.info(new Info().title("Global Solution - Microsserviço REST API").description("Global Solution")
						.termsOfService("terms").contact(new Contact().email("fiap@gmail.com"))
						.license(new License().name("GNU")).version("1.0"));
	}

}
