package io.github.brunnotoscano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){

    }

    private Contact contact(){
        return new Contact("Brunno Toscano Messias",
                "https://github.com/brunnotm23",
                "brunnotm23@gmail.com");
    }


}
