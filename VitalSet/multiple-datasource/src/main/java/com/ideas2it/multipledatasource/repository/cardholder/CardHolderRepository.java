package com.ideas2it.multipledatasource.repository.cardholder;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ideas2it.multipledatasource.model.cardholder.CardHolder;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}