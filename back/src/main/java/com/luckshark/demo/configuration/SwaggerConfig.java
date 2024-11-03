package com.luckshark.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
    public OpenAPI apiDocConfig() {
           return new OpenAPI()
                .info(new Info()
                        .title("Sales Shark API")
                        .description("Projeto de API modelo de Pedidos e Pagamentos")
                        .version("v1")
                        .contact(new Contact()
                                .name("Lucas Araújo")
                                .email("herpetolucas@gmail.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação no GitHub")
                        .url("https://github.com/LuckShark/Unit-Testing-Spring"));
    }
}
