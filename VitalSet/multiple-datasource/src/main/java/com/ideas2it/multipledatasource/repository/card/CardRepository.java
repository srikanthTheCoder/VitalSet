package com.ideas2it.multipledatasource.repository.card;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ideas2it.multipledatasource.entity.card.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	
	@Query("select u from Card u where u.firstName = :firstName or u.lastName = :lastName")
	List<Card> findByLastNameOrFirstName(@Param("lastName") String lastName, 
			@Param("firstName") String firstName);
	
	@Query("select u from Card u where u.firstName = :firstName")
	Optional<Card> findByFirstName(@Param("firstName") String firstName);
	
}	