package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CrudOperations {
	@Autowired
	RestConfig co;
	
	public  Sdetails[] display() {
		
		HttpEntity <Sdetails[]> entity = new HttpEntity<Sdetails[]>(co.headers);
		ResponseEntity<Sdetails[]> response = co.restTemplate.exchange(co.URL, HttpMethod.GET, entity, Sdetails[].class);
		//System.out.println("Response", response);
		return response.getBody();

	}

}
