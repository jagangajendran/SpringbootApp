package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sdetails {
	@Id
	String regno;
	@Column
	String name;
	@Column
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
		return regno+"--"+name+"--"+dob;
	}

}
