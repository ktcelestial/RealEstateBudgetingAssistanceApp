package com.example.bjprea.backend_java_prea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendJavaPreaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendJavaPreaApplication.class, args);

		InitApplication INITAPP = new InitApplication();
		INITAPP.fetchUserInit();
	}

}
