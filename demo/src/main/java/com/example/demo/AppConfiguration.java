package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessage() {
        return "Texto de configuração";
    }
    @Bean
    public String init() {
        return "Inicializado"; 
    }
}
