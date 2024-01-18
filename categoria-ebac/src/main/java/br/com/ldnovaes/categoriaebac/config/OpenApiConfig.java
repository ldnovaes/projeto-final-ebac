package br.com.ldnovaes.categoriaebac.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Serviço de Categoria")
                        .description("Microsserviço de categoria que compõe o projeto final da ebac")
                        .contact(new Contact().name("Leandro Duarte").email("leandroduarte2012@hotmail.com")).version("1.0.0"));
    }
}
