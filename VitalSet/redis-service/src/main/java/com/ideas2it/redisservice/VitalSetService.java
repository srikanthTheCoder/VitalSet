package com.ideas2it.redisservice;

import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public interface VitalSetService {

	public VitalSet createVitalSet(VitalSet set);

	public VitalSet updateVitalSet(long id, VitalSet set);

	public List<VitalSet> findAll();

	public Map<String, Boolean> deleteById(long id);

	//@Cacheable(value = "vital", key = "#id")
	public VitalSet findById(long id);
	
}
