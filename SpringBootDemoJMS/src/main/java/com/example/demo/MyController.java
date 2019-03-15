package com.example.demo;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJms
public class MyController {
	@RequestMapping(method = RequestMethod.POST,  value ="/sendmessage")
	public String sendMessage(@RequestBody String msg){
		JmsTemplate jmsTemplate = SpringBootDemoJmsApplication.context.getBean(JmsTemplate.class);
		System.out.println("Sending Message from JMS");
		jmsTemplate.convertAndSend("msgProcess", msg );
		 return "Sent msg---" + msg;
	}
	
	
}
