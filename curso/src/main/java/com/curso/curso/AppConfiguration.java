package com.curso.curso;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessage() {
        return "Mensagem retornada";
    }
}
