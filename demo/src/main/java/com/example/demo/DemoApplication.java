package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private AppConfiguration appConfiguration;

	// public DemoApplication(AppConfiguration appConfiguration) {
	// this.appConfiguration = appConfiguration;
	// }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/inicio")
	public String inicio() {
		return "Olá spring boot";
	}

	@GetMapping("/configuracao")
	public String config() {
		return appConfiguration.getMessage();
	}

}
