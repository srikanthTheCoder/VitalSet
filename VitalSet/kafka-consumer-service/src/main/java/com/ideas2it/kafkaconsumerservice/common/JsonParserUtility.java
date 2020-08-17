package com.ideas2it.kafkaconsumerservice.common;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonParserUtility {

	private static final Logger logger = LoggerFactory.getLogger(JsonParserUtility.class);
	private ObjectMapper mapper;

	@Autowired
	public JsonParserUtility(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	/**
	 * This method is used to convert the J-son data into respective class object
	 *  
	 * @param jsonData
	 * @param claz
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public <T> T jsonToObject(String jsonData, Class<T> claz) throws JsonParseException, JsonMappingException, IOException {
		logger.info("Converting the j-son string into object");
			return mapper.readValue(jsonData, claz);
	}

}
