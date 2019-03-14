package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

	public static Connection co = null;
	public Connection getConection() {
		try {
			if(co==null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				co= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jagan", "password321");
				System.out.println("Connected to DB");
				
			}
		} catch (Exception e) {
			System.out.println("Error in Connecting to DB");
			// TODO: handle exception
		}
		return co;
	}
	
}
