package com.example.demo;

public class Sdetails {
	
	String regno;
	
	String name;
	
	String dob;
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+regno+" " +dob;
	}

}
