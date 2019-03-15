package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class Test3 {
	static final String URL_EMPLOYESS= "http://localhost:2022/sdetails";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate= new RestTemplate();
		Sdetails[] list= restTemplate.getForObject(URL_EMPLOYESS, Sdetails[].class );
		if(list !=null) {
			for(Sdetails e:list) {
				System.out.println(e);
			}
		}
	}

}
