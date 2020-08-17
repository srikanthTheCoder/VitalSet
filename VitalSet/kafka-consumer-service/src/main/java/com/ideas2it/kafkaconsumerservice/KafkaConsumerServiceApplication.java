package com.ideas2it.kafkaconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ideas2it.kafkaconsumerservice.repo.PayloadRequestRepo;

@SpringBootApplication
public class KafkaConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerServiceApplication.class, args);
	}

}
