package com.example.servicedetails;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ServiceDetailsService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private ServiceDetailsRepository detailsRepository;

	public ServiceDetailsService(ServiceDetailsRepository detailsRepository) {
		this.detailsRepository = detailsRepository;
	}
	@Cacheable("ServiceDetails")
	public void saveServiceDetails(ServiceDetails details) {
		detailsRepository.save(details);
	}
	
	//@Cacheable("ServiceDetails")
	@CachePut("ServiceDetails")
	public ServiceDetails updateServiceDetails(int id, ServiceDetails details) {
		logger.info("updateServiceDetails");
		Optional<ServiceDetails> optionalDetails = detailsRepository.findById(id);
		if (optionalDetails.isPresent()) {
			ServiceDetails newDetails = optionalDetails.get();
			newDetails.setApplicationName(details.getApplicationName());
			newDetails.setPath(details.getPath());
			newDetails.setQuery(details.getQuery());
		return	detailsRepository.save(newDetails);
		}
		return details;
	}
	
	@Cacheable("ServiceDetails")
	public List<ServiceDetails> findByApplicationNameAndPath(String applicationName, String path) {
		logger.info("findByApplicationNameAndPath");
		return detailsRepository.findByApplicationNameAndPath(applicationName, path);
	}
	@Cacheable("ServiceDetails")
	public String findPathByApplicationName(String applicationName) {
		logger.info("findPathByApplicationName");
		return detailsRepository.findPathByApplicationName(applicationName);
	}
	
	@Cacheable("ServiceDetails")
	public ServiceDetails findById(int id) {
		logger.info("findById");
		Optional<ServiceDetails> optionalDetails = detailsRepository.findById(id);
		return optionalDetails.get();
	}
	
	@CacheEvict("ServiceDetails")
	public void deleteServiceDetails(int id) {
		logger.info("deleteServiceDetails");
		detailsRepository.deleteById(id);
	}
	
	@Cacheable(cacheNames="ServiceDetails")
	public List<ServiceDetails> findAll() {
		logger.info("findAll");
		return detailsRepository.findAll();
	}
	
}
