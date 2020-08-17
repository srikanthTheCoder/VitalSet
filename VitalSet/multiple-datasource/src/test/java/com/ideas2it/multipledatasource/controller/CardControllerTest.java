package com.ideas2it.multipledatasource.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ideas2it.multipledatasource.DataBuilder;
import com.ideas2it.multipledatasource.controller.card.CardController;
import com.ideas2it.multipledatasource.model.card.CardDTO;
import com.ideas2it.multipledatasource.service.ICardService;

//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith({ MockitoExtension.class, SpringExtension.class })
@MockitoSettings(strictness = Strictness.LENIENT)
@AutoConfigureMockMvc
public class CardControllerTest {
	
	@Mock
	ICardService cardService;
	
	@InjectMocks 
	CardController cardController;
	
	@Autowired
	public MockMvc mockMvc;

	@BeforeEach
	public void setup() {
		cardController = new CardController(cardService);
		mockMvc = MockMvcBuilders.standaloneSetup(cardController).build();
	}
	
	@Test
	@DisplayName(value = "Should be able search Card by name")
	public void shouldReturn_Card_search_by_firstName() throws Exception {
		when(cardService.findByFirstName(ArgumentMatchers.anyString())).thenReturn(DataBuilder.stubCard());
		RequestBuilder builder = MockMvcRequestBuilders.get("/card/firstName/{firstName}", "sundar")
				.contentType(MediaType.APPLICATION_JSON);

		MockHttpServletResponse response = mockMvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse();
		Assert.isTrue(response.getStatus() == HttpStatus.OK.value());
	}

	@Test
	@DisplayName(value = "Should be able search Card by first and last name")
	public void shouldReturn_Card_search_by_first_and_last_name() throws Exception {
		when(cardService.findByLastNameOrFirstName(ArgumentMatchers.anyString(),ArgumentMatchers.anyString())).thenReturn(DataBuilder.stubGetAllCardResponse());
		RequestBuilder builder = MockMvcRequestBuilders.get("/card/lastName/{lastname}/firstName/{firstname}", "moorthi","sundar")
				.contentType(MediaType.APPLICATION_JSON);

		MockHttpServletResponse response = mockMvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse();
		Assert.isTrue(response.getStatus() == HttpStatus.OK.value());
	}
	
	@Test
	@DisplayName(value = "Should be able create Card")
	public void shouldReturn_Card_on_creation() throws Exception {
		String jsonString = new ObjectMapper().writeValueAsString(DataBuilder.stubCard());
		when(cardService.create(ArgumentMatchers.any(CardDTO.class))).thenReturn(DataBuilder.stubResponse());
		RequestBuilder builder = MockMvcRequestBuilders.post("/card/")
				.contentType(MediaType.APPLICATION_JSON).content(jsonString);

		MockHttpServletResponse response = mockMvc.perform(builder)
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful()).andReturn().getResponse();
		System.out.println(response.getStatus() + "  ----  "+HttpStatus.CREATED.value());
		//Assert.isTrue(response.getStatus() == HttpStatus.CREATED.value());
	}
	
	@Test
	@DisplayName(value = "Should be able get all Cards")
	public void shouldReturn_All_Cards() throws Exception {

		when(cardService.findAll()).thenReturn(DataBuilder.stubGetAllCardResponse());
		RequestBuilder builder = MockMvcRequestBuilders.get("/card/").contentType(MediaType.APPLICATION_JSON);

		MockHttpServletResponse response = mockMvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse();
		Assert.isTrue(response.getStatus() == HttpStatus.OK.value());

	}

}
