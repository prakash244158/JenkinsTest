package com.BikkadIT.JenkinsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
		
		for(int i=1; i<=10; i++) {
			System.out.println("Bikkad IT");
		}
	}

}
