package com.token.example.TokenManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.token.example.TokenManagement.*"})
public class TokenManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenManagementApplication.class, args);
	}

}
