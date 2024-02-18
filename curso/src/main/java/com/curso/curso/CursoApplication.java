package com.curso.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CursoApplication {

	@Autowired
	private AppConfiguration appConfiguration;

	@Value("${app.message}")
	private String textoProperties;

	// public CursoApplication(AppConfiguration appConfiguration) {
	// 	this.appConfiguration = appConfiguration;
	// }

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
		System.out.println("A aplicação foi inicializada !");
	}
	@GetMapping("/inicio")
	public String inicio() {
		return textoProperties;
	}

	@GetMapping("/configuracao")
	public String configuracao() {
		return appConfiguration.getMessage();
	} 
}
