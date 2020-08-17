package com.example.servicedetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ServiceDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDetailsApplication.class, args);
	}

}
