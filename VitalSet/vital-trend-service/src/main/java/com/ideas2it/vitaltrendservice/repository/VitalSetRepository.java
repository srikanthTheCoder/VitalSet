package com.ideas2it.vitaltrendservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ideas2it.vitaltrendservice.model.VitalSet;

public interface VitalSetRepository extends JpaRepository<VitalSet, Long>{
	
	List<VitalSet> findAll();
	
	void deleteById(long id);
	
	Optional<VitalSet> findById(long id);

}
