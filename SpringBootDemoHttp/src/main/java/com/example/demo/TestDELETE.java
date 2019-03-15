package com.example.demo;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;

import org.springframework.web.client.RestTemplate;

public class TestDELETE {
	static final String URL_EMPLOYEES_DELETE = "http://localhost:2022/sdetails/{regno}";
	 
    public static void main(String[] args) {
    	
    	Sdetails deleteEmployee = new Sdetails();
    	
    	System.out.println("enter Regno to delete");
    	deleteEmployee.setRegno(Read.sc.next());
    
    	
    	System.out.println("deleteEmployee"+ deleteEmployee);
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
        HttpEntity<Sdetails> requestBody = new HttpEntity<Sdetails>(deleteEmployee, headers);
        restTemplate.delete(URL_EMPLOYEES_DELETE, requestBody);
        
        /*Sdetails e= restTemplate.getForObject(URL_EMPLOYEES_UPDATE+"/"+updateEmployee.getRegno(), Sdetails.class);
        		if (e ==null) {
        			System.out.println("Employee Updated");
        			
        		}else {
        			System.out.println("Error in Employee Updation");
        		}*/
 
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
