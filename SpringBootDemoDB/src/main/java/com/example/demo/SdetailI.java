package com.example.demo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public interface SdetailI extends CrudRepository<Sdetails, String>{
	
 public Optional<Sdetails> findByName(String name);
 public Optional<Sdetails> findByDob(String dob);
	 
 
}
