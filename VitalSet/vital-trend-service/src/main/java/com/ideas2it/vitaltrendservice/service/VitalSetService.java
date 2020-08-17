package com.ideas2it.vitaltrendservice.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ideas2it.vitaltrendservice.model.PayloadRequest;
import com.ideas2it.vitaltrendservice.model.VitalSet;

@Component
public interface VitalSetService {

	public VitalSet createVitalSet(VitalSet set);

	public VitalSet updateVitalSet(long id, VitalSet set);

	public List<VitalSet> findAll();

	public Map<String, Boolean> deleteById(long id);

	public VitalSet findById(long id);
	
	public void sendMessage(PayloadRequest message);

}
