package com.ideas2it.kafkaconsumerservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ideas2it.kafkaconsumerservice.model.PayloadRequest;

@Repository
public interface PayloadRequestRepo extends MongoRepository<PayloadRequest, Long>{

}
