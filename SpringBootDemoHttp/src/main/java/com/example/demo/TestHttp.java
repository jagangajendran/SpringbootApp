package com.example.demo;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestHttp {
	static final String URL_EMPLOYEES = "http://localhost:2022/sdetails";
	 
    public static void main(String[] args) {
 
    	
        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();
 
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
       // headers.set("my_other_key", "my_other_value");
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<Sdetails> entity = new HttpEntity<Sdetails>(headers);
 
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
 
        // Send request with GET method, and Headers.
        ResponseEntity<Sdetails[]> response = restTemplate.exchange(TestHttp.URL_EMPLOYEES ,
                HttpMethod.GET, entity, Sdetails[].class);
                
                HttpStatus statusCode = response.getStatusCode();
                System.out.println("response statuscode " +statusCode);
                if (statusCode ==HttpStatus.OK){
                Sdetails[] list = response.getBody();
                
				if(list !=null) {
					for(Sdetails e:list) {
						System.out.println(e);
					}
				}
                }
                
 
       // Sdetails result = response.getBody();
 
       // System.out.println(result);
    }

}