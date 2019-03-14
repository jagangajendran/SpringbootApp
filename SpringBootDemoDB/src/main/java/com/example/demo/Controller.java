package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	SdetailI ob;
	//SmarksI ob1;
	
	@RequestMapping(method=RequestMethod.POST,value="/sdetails")
	public void insert(@RequestBody Sdetails ob1 ) {
		ob.save(ob1);
	}
	/*@RequestMapping(method=RequestMethod.POST,value="/smarks")
	public void insertMarks(@RequestBody Smarks obj ) {
		ob1.save(obj);
	}*/
	@RequestMapping(method=RequestMethod.DELETE,value="/sdetails/{regno}")
	public void delete (@PathVariable String regno ) {
		ob.deleteById(regno);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/sdetails")
	public void update (@RequestBody Sdetails ob1 ) {
		ob.save(ob1);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/sdetails")
	public List<Sdetails> display(){
		List<Sdetails> li = new ArrayList<Sdetails>();
		ob.findAll().forEach((p)-> {li.add(p);});
		return li;
			
	}
	/*@RequestMapping("/smarks")
	public List<Smarks> displayMarks(){
		List<Smarks> li = new ArrayList<Smarks>();
		ob1.findAll().forEach((p)-> {li.add(p);});
		return li;
			
	}*/
	@RequestMapping("/sdetails/{regno}")
	public Sdetails FindbyId(@PathVariable String regno){
		//List<Sdetails> li = new  ArrayList<Sdetails>();
		Optional<Sdetails> obj = ob.findById(regno);
		return obj.get();
		
		
	}
	
	@RequestMapping("/sdetails/name/{name}")
	public Sdetails FindByName(@PathVariable String name){
		Optional<Sdetails> obj = ob.findByName(name);
		return obj.get();
		
		
	}
	
	@RequestMapping("/sdetails/dob/{dob}")
	public Sdetails FindByDob(@PathVariable String dob){
		Optional<Sdetails> obj = ob.findByDob(dob);
		return obj.get();
		
		
	}
	

}
