package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	CrudOperations ob;
	
	@RequestMapping("/get")
	public Sdetails[] f1() {
		return ob.display();
	}
	

}
