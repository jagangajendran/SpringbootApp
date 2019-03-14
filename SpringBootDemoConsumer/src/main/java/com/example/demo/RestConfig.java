package com.example.demo;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestConfig {
	static final String URL= "http://localhost:2022/sdetails";
	HttpHeaders headers;
	RestTemplate restTemplate;
	
	public  RestConfig() {
        headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        headers.setContentType(MediaType.APPLICATION_JSON);
        restTemplate = new RestTemplate();	
	}

}
