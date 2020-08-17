//package com.ideas2it.vitaltrendservice.controller;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.ideas2it.vitaltrendservice.model.VitalSet;
//import com.ideas2it.vitaltrendservice.service.impl.VitalSetServiceImpl;
//
//@WebMvcTest(controllers = VitalTrendServiceController.class)
//public class VitalTrendServiceControllerTests {
//
//	@Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private VitalSetServiceImpl service;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Test
//	public void findAllVitalSet() throws Exception {
//		List<VitalSet> vitalSetList = new ArrayList<>();
//		vitalSetList
//		.add(new VitalSet(1l, "System", "Ram", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020", "8:00 am"));
//vitalSetList
//		.add(new VitalSet(2l, "System", "Prem", "Kumar", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020", "8:00 am"));
//vitalSetList.add(
//		new VitalSet(3l, "System", "Ram", "Moorthi", 100, 70, 80, 90, 145, 40.9, "13-Jul-2020", "8:00 am"));
//		when(service.findAll()).thenReturn(vitalSetList);
//		mockMvc.perform(get("/vitalsets")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(1)))
//				.andExpect(jsonPath("$[0].id", Matchers.equalTo(1l)));
//	}
//}
