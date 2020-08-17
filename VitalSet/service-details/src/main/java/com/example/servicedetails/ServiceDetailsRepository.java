package com.example.servicedetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServiceDetailsRepository extends JpaRepository<ServiceDetails, Integer>{

	@Query("select u from ServiceDetails u where u.applicationName = :applicationName and u.path = :path")
	List<ServiceDetails> findByApplicationNameAndPath(@Param("applicationName") String applicationName, 
			@Param("path") String path);
	
	
	@Query("select u.path from ServiceDetails u where u.applicationName = :applicationName")
	String findPathByApplicationName(@Param("applicationName") String applicationName);
	
	
}
