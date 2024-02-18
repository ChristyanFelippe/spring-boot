package com.curso.curso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessage() {
        return "Mensagem retornada";
    }

    @Bean
    public String init(){
        System.out.println("Init inicializado");
        return "Foi instanciado init.";
    }
}
