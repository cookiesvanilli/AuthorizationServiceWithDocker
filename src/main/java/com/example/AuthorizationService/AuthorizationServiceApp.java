package com.example.AuthorizationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServiceApp.class, args);
	}

}
// localhost:8080/authorize?user=<ИМЯ_ЮЗЕРА>&password=<ПАРОЛЬ_ЮЗЕРА>