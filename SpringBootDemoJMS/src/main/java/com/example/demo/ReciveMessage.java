package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReciveMessage {
	@JmsListener(destination = "msgProcess", containerFactory ="myFactory")
	public void receiveMessage(String msg) {
		System.out.println("Msg Received" + msg);
		
	}
	
	
}
