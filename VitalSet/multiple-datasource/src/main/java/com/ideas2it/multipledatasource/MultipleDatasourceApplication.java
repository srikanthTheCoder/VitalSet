package com.ideas2it.multipledatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MultipleDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatasourceApplication.class, args);
	}
	
//	@Bean
//    public CacheManager cacheManager() {
//        // configure and return an implementation of Spring's CacheManager SPI
//        SimpleCacheManager cacheManager = new SimpleCacheManager();
//        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("default")));
//        return cacheManager;
//    }

}
