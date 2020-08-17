package com.ideas2it.redisservice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VitalSetRepository extends JpaRepository<VitalSet, Long>{
	
	List<VitalSet> findAll();
	
	void deleteById(long id);
	
	Optional<VitalSet> findById(long id);

}
