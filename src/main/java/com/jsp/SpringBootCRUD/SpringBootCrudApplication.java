package com.jsp.SpringBootCRUD;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootCrudApplication {
	@Value("${server.port}")
	private String serverPort;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}
	@PostConstruct
	public void printProperties() {
		System.out.println("server port: " + serverPort);

		System.out.println("soni puyed code changes");
	}



}