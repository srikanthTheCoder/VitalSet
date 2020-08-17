//package com.ideas2it.multipledatasource.mapper.card;
//
//import com.ideas2it.multipledatasource.entity.card.Card;
//import com.ideas2it.multipledatasource.model.card.CardDTO;
//
//public abstract class CardMapperDecorator implements CardMapper {
//
//	private final CardMapper delegate;
//
//	public CardMapperDecorator(CardMapper delegate) {
//		//super();
//		this.delegate = delegate;
//	}
//
//	@Override
//	public CardDTO convertCardToCardDTO(Card card) {
//		CardDTO cardDTO = delegate.convertCardToCardDTO(card); // Executes the mapper
//		cardDTO.setName(card.getFirstName() + " " + card.getLastName());
//		return cardDTO;
//	}
//
//	@Override
//	public Card convertCardDTOToCard(CardDTO cardDTO) {
//		Card card = delegate.convertCardDTOToCard(cardDTO);
//		String[] names = cardDTO.getName().split(" ");
//		card.setFirstName(names[0]);
//		card.setLastName(names[1]);
//		return card;
//	}
//
//}
