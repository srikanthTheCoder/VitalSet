package com.ideas2it.multipledatasource.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ideas2it.multipledatasource.entity.card.Card;
import com.ideas2it.multipledatasource.mapper.card.CardMapper;
import com.ideas2it.multipledatasource.model.card.CardDTO;
import com.ideas2it.multipledatasource.model.response.ResponseDTO;
import com.ideas2it.multipledatasource.repository.card.CardRepository;
@Service
public class CardServiceImpl implements ICardService {

	private CardRepository cardRepository;
	private CardMapper cardMapper;
	
	public CardServiceImpl(CardRepository cardRepository, CardMapper cardMapper) {
		this.cardRepository = cardRepository;
		this.cardMapper = cardMapper;
	}

	@Override
	public ResponseDTO create(CardDTO cardDTO) {
		Card card = cardMapper.convertCardDTOToCard(cardDTO);
		Card responseCard = cardRepository.save(card);
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setId(responseCard.getId());
		responseDTO.setMessage("Card created successfully");
		return responseDTO;
	}

	@Override
	public List<CardDTO> findAll() {
		List<Card> card = new ArrayList<Card>();
		List<CardDTO> cardDTOList = new ArrayList<CardDTO>();
		cardRepository.findAll().forEach(cardResult -> card.add(cardResult));
		for (Card car : card) {
			CardDTO cardDTO = cardMapper.convertCardToCardDTO(car);
			cardDTOList.add(cardDTO);
		}
		return cardDTOList;
	}

	@Override
	public List<CardDTO> findByLastNameOrFirstName(String lastname, String firstname) {
		List<CardDTO> cardDTOList = new ArrayList<CardDTO>();
		List<Card> card = cardRepository.findByLastNameOrFirstName(lastname, firstname);
		for (Card car : card) {
			CardDTO cardDTO = cardMapper.convertCardToCardDTO(car);
			cardDTOList.add(cardDTO);
		}
		return cardDTOList;
	}

	@Override
	public CardDTO findByFirstName(String firstName) {
		CardDTO cardDTO = new CardDTO();
		Optional<Card> card = cardRepository.findByFirstName(firstName);
		 cardDTO = cardMapper.convertCardToCardDTO(card.get());
		 return cardDTO;
	}

}
