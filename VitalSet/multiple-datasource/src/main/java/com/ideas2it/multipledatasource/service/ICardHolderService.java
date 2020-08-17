package com.ideas2it.multipledatasource.service;

import java.util.List;

import com.ideas2it.multipledatasource.model.cardholder.CardHolder;

public interface ICardHolderService {

	void create(CardHolder cardHolder);
	
	 List<CardHolder> findAll();
	
}
