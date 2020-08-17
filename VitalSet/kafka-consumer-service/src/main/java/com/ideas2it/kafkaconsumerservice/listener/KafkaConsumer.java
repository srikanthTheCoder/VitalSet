package com.ideas2it.kafkaconsumerservice.listener;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ideas2it.kafkaconsumerservice.common.JsonParserUtility;
import com.ideas2it.kafkaconsumerservice.model.PayloadRequest;
import com.ideas2it.kafkaconsumerservice.repo.PayloadRequestRepo;

@Service
public class KafkaConsumer {

	@Autowired
	private PayloadRequestRepo repo;
	
	@Autowired
	private JsonParserUtility jsonParserUtility;
	
	@KafkaListener(topics = "Kafka_logs")
    public void consume(String message) throws JsonParseException, JsonMappingException, IOException
	{
    	
        System.out.println("Consumed message: " +  message);
   
        PayloadRequest payload = jsonParserUtility.jsonToObject(message, PayloadRequest.class);
        
        
        repo.save(payload);

    }

}
