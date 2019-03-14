package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/*public class SchoolDao {
	@Autowired
	//DbConnect db1;
	DbConnect db = new DbConnect();
	
	public List<Sdetails> getDetails(){
		List<Sdetails> li = new ArrayList<Sdetails>();
		try {
			Connection c = db.getConection();
			PreparedStatement ps = c.prepareStatement("select * from STUDENT");
			ResultSet rs = ps.executeQuery();
			Sdetails ob;
			while(rs.next()) {
			ob= new Sdetails();
			ob.setRegno(rs.getString(1));
			ob.setName(rs.getString(2));
			ob.setDob(rs.getString(3));
			
			li.add(ob);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return li;
		
	}
	

}*/
