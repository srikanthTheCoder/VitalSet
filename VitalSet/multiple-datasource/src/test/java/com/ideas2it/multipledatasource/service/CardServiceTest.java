//package com.ideas2it.multipledatasource.service;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.ideas2it.multipledatasource.entity.card.Card;
//import com.ideas2it.multipledatasource.mapper.card.CardMapper;
//import com.ideas2it.multipledatasource.model.card.CardDTO;
//import com.ideas2it.multipledatasource.repository.card.CardRepository;
//
//@RunWith(MockitoJUnitRunner.class)
//public class CardServiceTest {
//
//	@Mock
//    private CardRepository cardRepository;
//	
//	@Mock
//    private CardMapper cardMapper;
//
//    @InjectMocks
//    private CardServiceImpl cardService;
//    
////    @Test
////    void createCardSuccessfully() {
////    	final Card card = new Card(1l, "Sundar", "Moorthi", 1, 2020, new Date(), new Date());
////    	CardDTO cardDTO = new CardDTO("Sundar", "Moorthi", 1, 2020);
////    	when(cardRepository.save(card)).thenReturn(card);
////    	//Card responseCard = cardService.create(cardDTO);
////    	ResponseDTO responseDTO = new ResponseDTO();
////    	responseDTO = cardService.create(cardDTO);
////		//responseDTO.setId(responseCard.getId());
////		//responseDTO.setMessage("Card created successfully");
////    }
//    
//    @Test
//    void shouldReturnFindAll() {
//    	List<Card> cardList = new ArrayList<>();
//    	List<CardDTO> cardDTOList = new ArrayList<CardDTO>();
//    	List<CardDTO> expected = new ArrayList<CardDTO>();
//    	cardList.add(new Card(1l, "Sundar", "Moorthi", 1, 2020, new Date(), new Date()));
//    	cardList.add(new Card(2l, "Sundar", "Moorthi", 1, 2020, new Date(), new Date()));
//    	
//    	when(cardRepository.findAll()).thenReturn(cardList);
//    	
//    	cardRepository.findAll().forEach(cardResult -> cardList.add(cardResult));
//    	for (Card car : cardList) {
//			CardDTO cardDTO = cardMapper.convertCardToCardDTO(car);
//			cardDTOList.add(cardDTO);
//		}
//    	
//    	assertEquals(expected, cardList);
//    	
//    }
//    
//    
//    
//}
