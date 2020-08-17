package com.ideas2it.multipledatasource.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.ideas2it.multipledatasource.model.card.CardDTO;
import com.ideas2it.multipledatasource.model.response.ResponseDTO;

public interface ICardService {

	 ResponseDTO create(CardDTO cardDTO);
	
	 List<CardDTO> findAll();
	 
	 List<CardDTO> findByLastNameOrFirstName(String lastname, String firstname);
	
	 @Cacheable(value = "Card", key = "#firstName")
	 CardDTO findByFirstName(String firstName);
}
