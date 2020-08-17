package com.example.servicedetails;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceDetailsController {

	private ServiceDetailsService detailsService;

	public ServiceDetailsController(ServiceDetailsService detailsService) {
		this.detailsService = detailsService;
	}
	
	@PostMapping("/")
	public void saveServiceDetails(@RequestBody ServiceDetails details) {
		detailsService.saveServiceDetails(details);
	}
	
	@PutMapping("/id/{id}")
	public ServiceDetails updateServiceDetails(@PathVariable int id, @RequestBody ServiceDetails details) {
		return detailsService.updateServiceDetails(id, details);
	}
	
	@GetMapping("/applicationName/{applicationName}/path/{path}")
	public List<ServiceDetails> findByApplicationNameAndPath(@PathVariable String applicationName, @PathVariable String path) {
		return detailsService.findByApplicationNameAndPath(applicationName, path);
	}
	
	@GetMapping("/applicationName/{applicationName}")
	public String findPathByApplicationName(@PathVariable String applicationName) {
		return detailsService.findPathByApplicationName(applicationName);
	}
	
	@DeleteMapping("/id/{id}")
	public void deleteServiceDetails(@PathVariable int id) {
		detailsService.deleteServiceDetails(id);
	}
	@GetMapping("/id/{id}")
	public ServiceDetails findById(@PathVariable int id) {
		return detailsService.findById(id);
	}
	
	@GetMapping("/")
	public List<ServiceDetails> findAll() {
		return detailsService.findAll();
	}
}
