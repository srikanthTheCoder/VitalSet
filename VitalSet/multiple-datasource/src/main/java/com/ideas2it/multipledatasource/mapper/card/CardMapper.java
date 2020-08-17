package com.ideas2it.multipledatasource.mapper.card;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ideas2it.multipledatasource.entity.card.Card;
//import com.ideas2it.multipledatasource.mapper.card.CardMapperDecorator;
import com.ideas2it.multipledatasource.model.card.CardDTO;
@Mapper(componentModel = "spring")
//@DecoratedWith(CardMapperDecorator.class)
public interface CardMapper {

	CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);
	
	/**
	  * We define only those mappings which doesn't have same signature in source and target
	  */  
	    @Mappings({ 
	     @Mapping(source = "expirationMonth", target = "expirationMonth"),
	     @Mapping(source = "expirationYear", target = "expirationYear")
	     ,
	     @Mapping(source = "firstName", target = "firstName"),
	     @Mapping(source = "lastName", target = "lastName"),
	    })
	    public CardDTO convertCardToCardDTO(Card card);
	    @InheritInverseConfiguration
	    Card convertCardDTOToCard(CardDTO cardDTO);
}
