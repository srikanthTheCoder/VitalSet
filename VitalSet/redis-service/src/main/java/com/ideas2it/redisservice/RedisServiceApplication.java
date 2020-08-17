package com.ideas2it.redisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@EnableCaching
@SpringBootApplication
public class RedisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisServiceApplication.class, args);
	}

}
