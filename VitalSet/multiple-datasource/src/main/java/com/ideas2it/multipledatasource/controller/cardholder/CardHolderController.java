package com.ideas2it.multipledatasource.controller.cardholder;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.multipledatasource.model.cardholder.CardHolder;
import com.ideas2it.multipledatasource.service.ICardHolderService;

@RestController
@RequestMapping("/cardholders")
public class CardHolderController {
	
private ICardHolderService cardHolderService;

public CardHolderController(ICardHolderService cardHolderService) {
	this.cardHolderService = cardHolderService;
}

@GetMapping("/")
public List<CardHolder> findAll() {
	return cardHolderService.findAll();
}
@PostMapping("/")
public void create(@RequestBody CardHolder cardHolder) {
	cardHolderService.create(cardHolder);
	
}

	
}
