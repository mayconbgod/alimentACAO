package com.example.alimentACAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//Iniciar app Springboot
@SpringBootApplication
@EntityScan("com.example.alimentACAO.model")
public class AlimentAcaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlimentAcaoApplication.class, args);
	}

}