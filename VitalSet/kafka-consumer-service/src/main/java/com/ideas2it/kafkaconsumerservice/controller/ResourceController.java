package com.ideas2it.kafkaconsumerservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.kafkaconsumerservice.model.PayloadRequest;
import com.ideas2it.kafkaconsumerservice.repo.PayloadRequestRepo;

@RestController
@RequestMapping("/Request")
public class ResourceController {
	
	@Autowired
	private PayloadRequestRepo repo;
	
	@GetMapping("/find/{id}")
	public Optional<PayloadRequest> getById(@PathVariable(value= "id") long id) {
		 Optional<PayloadRequest> sch = repo.findById(id);
		 System.out.println(sch.toString());
        return sch;
    }
	
	@GetMapping("/find")
	public List<PayloadRequest> getall() {
		List<PayloadRequest> sch =  repo.findAll();
		sch.forEach(System.out::println);
        return sch;
    }
	

}
