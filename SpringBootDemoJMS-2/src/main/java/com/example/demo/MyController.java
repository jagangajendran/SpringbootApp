package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	//@Autowired
	//CrudOperations ob;
	
	@RequestMapping("/sendmessage")
	public class SendMessage {
		@JmsListener(destination = "msgProcess", containerFactory ="myFactory")
		public void receiveMessage(String msg) {
			System.out.println("Msg Received" + msg);
			
		}	
		
	}

	

}
