package com.collections.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.collections")

public class MainApplication {
	public static void main(String args[]) {
		SpringApplication.run(MainApplication.class, args);
		System.out.println("inside the main class");
		
	}

}
