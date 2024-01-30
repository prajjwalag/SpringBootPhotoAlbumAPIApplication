package org.prajjwal.SpringRestdemo.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;


@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "Photos Album API",
    version = "Verions 1.0",
    contact = @Contact(
      name = "Prajjwal Agrahari", email = "prajjwal.agrahari16@gmail.com"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    description = "Spring Boot RestFul Photos Album API"
  )
)
public class SwaggerConfig {
}
