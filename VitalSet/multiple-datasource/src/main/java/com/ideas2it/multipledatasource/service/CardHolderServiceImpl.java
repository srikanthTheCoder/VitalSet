package com.ideas2it.multipledatasource.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ideas2it.multipledatasource.model.cardholder.CardHolder;
import com.ideas2it.multipledatasource.repository.cardholder.CardHolderRepository;

@Service
public class CardHolderServiceImpl implements ICardHolderService{

	private CardHolderRepository cardHolderRepository;
	
	public CardHolderServiceImpl(CardHolderRepository cardHolderRepository) {
		this.cardHolderRepository = cardHolderRepository;
	}

	@Override
	public void create(CardHolder cardHolder) {
		cardHolderRepository.save(cardHolder);
		
	}

	@Override
	public List<CardHolder> findAll() {
		return cardHolderRepository.findAll();
	}


}
