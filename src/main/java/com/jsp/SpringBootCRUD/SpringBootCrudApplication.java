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
		System.out.println("hiii im vinayak");
	}
	@PostConstruct
	public void printProperties() {
		System.out.println("server port: " + serverPort);

		System.out.println("soni puyed code changes");


		System.out.println("hiii this from soni puyed");



		System.out.println("chakradhar changes");

		System.out.println("hello everyone");
	}

		System.out.println("this is 2nd soni commit");

	}

}