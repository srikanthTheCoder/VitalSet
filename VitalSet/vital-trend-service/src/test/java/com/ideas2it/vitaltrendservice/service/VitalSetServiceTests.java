//package com.ideas2it.vitaltrendservice.service;
//
////import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.ideas2it.vitaltrendservice.exception.ResourceNotFoundException;
//import com.ideas2it.vitaltrendservice.model.VitalSet;
//import com.ideas2it.vitaltrendservice.repository.VitalSetRepository;
//import com.ideas2it.vitaltrendservice.service.impl.VitalSetServiceImpl;
//
//@SpringBootTest
//public class VitalSetServiceTests {
//
//	/**
//	 * Autowire in the service we want to test
//	 */
//	@InjectMocks
//	private VitalSetServiceImpl service;
//
//	/**
//	 * Create a mock implementation of the WidgetRepository
//	 */
//	@Mock
//	private VitalSetRepository repository;
//
//	@Test
//	void findByIdVitalSet() {
//		// Setup our mock repository
//		VitalSet vitalSet = new VitalSet(1l, "System", "Ram", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020",
//				"8:00 am");
//		when(repository.findById(vitalSet.getId())).thenReturn(Optional.of(vitalSet));
//
//		// Execute the service call
//		VitalSet returnedVitalSet = service.findById(vitalSet.getId());
//
//		Assertions.assertEquals("System", returnedVitalSet.getUsername());
//		//assertThat(vitalSet).isEqualTo(returnedVitalSet);
//		//assertThat(returnedVitalSet).isNotNull();
//		verify(repository).findById(vitalSet.getId());
//	}
//
//	@Test
//	public void findAllVitalSet() {
//		List<VitalSet> vitalSetList = new ArrayList<VitalSet>();
//		vitalSetList
//				.add(new VitalSet(1l, "System", "Ram", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020", "8:00 am"));
//		vitalSetList
//				.add(new VitalSet(2l, "System", "Prem", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020", "8:00 am"));
//		vitalSetList.add(
//				new VitalSet(3l, "System", "Ram", "Moorthi", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020", "8:00 am"));
//		when(repository.findAll()).thenReturn(vitalSetList);
//
//		List<VitalSet> returnedVitalSet = service.findAll();
//		Assertions.assertEquals(3, returnedVitalSet.size());
//		Assertions.assertEquals(returnedVitalSet, vitalSetList);
//		verify(repository).findAll();
//	}
//
//	@Test
//	public void saveVitalSet() {
//		VitalSet vitalSet = new VitalSet(1l, "System", "Ram", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020",
//				"8:00 am");
//		when(repository.save(vitalSet)).thenReturn(vitalSet);
//		VitalSet result = service.createVitalSet(vitalSet);
//		//assertThat(result).isNotNull();
//
//		verify(repository).save(vitalSet);
//	}
//
//	@Test
//	public void updateVitalSet() throws ResourceNotFoundException {
//		VitalSet vitalSet = new VitalSet(2l, "System", "Ram", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020",
//				"8:00 am");
//		when(repository.findById(vitalSet.getId())).thenReturn(Optional.of(vitalSet));
//		when(repository.save(vitalSet)).thenReturn(vitalSet);
//		service.findById(vitalSet.getId());
//		service.updateVitalSet(vitalSet.getId(), vitalSet);
//
//		verify(repository).save(vitalSet);
//	}
//
////	
//	@Test
//	public void deleteByIdVitalSet() {
//		VitalSet vitalSet = new VitalSet(1l, "System", "Ram", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020",
//				"8:00 am");
//		when(repository.findById(vitalSet.getId())).thenReturn(Optional.of(vitalSet));
//
//		service.deleteById(vitalSet.getId());
//		service.deleteById(vitalSet.getId());
//
//		verify(repository, times(2)).deleteById(vitalSet.getId());
//	}
//}
