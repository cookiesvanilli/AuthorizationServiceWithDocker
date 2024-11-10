package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServiceApp {

	public static void main(String[] args) {

		SpringApplication.run(AuthorizationServiceApp.class, args);
	}

}
// localhost:8080/authorize?user=<Anna>&password=<1234>