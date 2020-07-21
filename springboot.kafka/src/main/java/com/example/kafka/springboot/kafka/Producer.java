package com.example.kafka.springboot.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	
	private static final String TOPIC = "test_null";
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplete;
	

	public void sendMesage(String message) {
		this.kafkaTemplete.send(TOPIC,message);
		
	}

}
