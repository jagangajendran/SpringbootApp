package com.example.demo;

import java.util.Scanner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;

import org.springframework.web.client.RestTemplate;

class Read {
	public static Scanner sc = new Scanner(System.in);
	
}
public class TestPost {
	static final String URL_EMPLOYEES_CREATE = "http://localhost:2022/sdetails";
	 
    public static void main(String[] args) {
    	
    	Sdetails newEmployee = new Sdetails();
    	
    	System.out.println("enter Regno, name, dob");
    	newEmployee.setRegno(Read.sc.next());
    	newEmployee.setName(Read.sc.next());
    	newEmployee.setDob(Read.sc.next());
    	
    	System.out.println("newEmployee"+ newEmployee);
        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
 
        //headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

       // headers.set("my_other_key", "my_other_value");
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<Sdetails> requestBody = new HttpEntity<Sdetails>( newEmployee, headers);
        Sdetails e= restTemplate.postForObject(URL_EMPLOYEES_CREATE, requestBody, Sdetails.class);
        		if (e ==null) {
        			System.out.println("Employee Created");
        			
        		}else {
        			System.out.println("Error in Employee Creation");
        		}
 
        /* Send request with GET method, and Headers.
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
                }*/
               
    }

}
