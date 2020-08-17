package com.ideas2it.multipledatasource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ideas2it.multipledatasource.model.card.CardDTO;
import com.ideas2it.multipledatasource.model.response.ResponseDTO;

public class DataBuilder {

	public static List<CardDTO> stubGetAllCardResponse() {
		List<CardDTO> cardList = new ArrayList<>();
		cardList.add(stubCard());
		return cardList;
	}

	public static CardDTO stubCard() {
		CardDTO cardDTO = new CardDTO();
		cardDTO.setFirstName("sundar");
		cardDTO.setLastName("moorthi");
		cardDTO.setExpirationMonth(1);
		cardDTO.setExpirationYear(2020);
		return cardDTO;
	}

	public static ResponseDTO stubResponse() {
		ResponseDTO respone = new ResponseDTO();
		respone.setId(new Long("1"));
		respone.setCreatedTime(OffsetDateTime.now());
		respone.setMessage("Created Successfully");
		return respone;
	}
}