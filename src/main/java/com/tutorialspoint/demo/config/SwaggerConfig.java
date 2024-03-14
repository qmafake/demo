package com.tutorialspoint.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Flash Trader Treasury API")
                .description(
                    "Collection of REST/JSON APIs to access the Demo Application")
                .version("1.0.0")
                .contact(
                    new Contact()
                        .name("Flash")
                        .url("http://www.flash.co.za")
                        .email("me@me.co.za")));
  }
}
