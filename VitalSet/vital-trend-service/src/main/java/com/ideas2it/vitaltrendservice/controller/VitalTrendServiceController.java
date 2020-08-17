package com.ideas2it.vitaltrendservice.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.vitaltrendservice.model.VitalSet;
import com.ideas2it.vitaltrendservice.service.VitalSetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RefreshScope
@RestController
@RequestMapping
@Api(value = "vital set-controller")
public class VitalTrendServiceController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private VitalSetService vitalSetService;

	public VitalTrendServiceController(VitalSetService vitalSetService) {
		this.vitalSetService = vitalSetService;
	}
	LocalDateTime currentTime = LocalDateTime.now();

	@ApiOperation(value = "finding all vital set")
	@GetMapping("/")
	@PreAuthorize("hasRole('ROLE_operator')")
	public ResponseEntity<List<VitalSet>> getAllVitalSets() {
		logger.info("finding all vital set in controller - " + currentTime);
		return new ResponseEntity<>(vitalSetService.findAll(), HttpStatus.OK);
	}

	@ApiOperation(value = "finding vital set by id")
	@GetMapping("/{id}")
	public ResponseEntity<VitalSet> getVitalSets(@PathVariable("id") long id) {
		logger.info("finding vital set by id in controller : "+id +" - " + currentTime);
		return new ResponseEntity<>(vitalSetService.findById(id), HttpStatus.OK);
	}

	@ApiOperation(value = "updating vital set by id")
	@PutMapping("/{id}")
	public ResponseEntity<VitalSet> updateVitalSet(@PathVariable("id") long id, @RequestBody VitalSet vitalset) {
		logger.info("updating vital set by id in controller : "+id +" - " + currentTime);
		return new ResponseEntity<>(vitalSetService.updateVitalSet(id, vitalset), HttpStatus.OK);
	}

	@ApiOperation(value = "creating new vital set")
	@PostMapping("/")
	@PreAuthorize("hasAuthority('create_profile')")
	public ResponseEntity<VitalSet> createVitalSet(@RequestBody VitalSet vitalset) {
		logger.info("updating vital set by  in controller : "+vitalset +" - " + currentTime);
		return new ResponseEntity<>(vitalSetService.createVitalSet(vitalset), HttpStatus.CREATED);
	}

	@ApiOperation(value = "deleting vital set by id")
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteVitalSet(@PathVariable("id") long id) {
		logger.info("deleting vital set by id in controller: "+id +" - " + currentTime);
		return vitalSetService.deleteById(id);
	}

}
