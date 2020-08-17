package com.ideas2it.multipledatasource.controller.card;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.multipledatasource.model.card.CardDTO;
import com.ideas2it.multipledatasource.model.response.ResponseDTO;
import com.ideas2it.multipledatasource.service.ICardService;

@RestController
@RequestMapping("/card")
public class CardController {
	
	private ICardService cardService;

	public CardController(ICardService cardService) {
		this.cardService = cardService;
	}

	@GetMapping("/")
	public List<CardDTO> findAll() {
		return cardService.findAll();
	}
	@PostMapping("/")
	public ResponseDTO create(@RequestBody CardDTO card) {
		return cardService.create(card);
		
	}
	
	@GetMapping("/lastName/{lastname}/firstName/{firstname}")
	public List<CardDTO> findByLastNameOrFirstName(@PathVariable String lastname, @PathVariable String firstname) {
		return cardService.findByLastNameOrFirstName(lastname, firstname);
	
	}
	
	@GetMapping("/firstName/{firstname}")
	public CardDTO findByFirstName(@PathVariable String firstname) {
		return cardService.findByFirstName(firstname);
	
	}
}