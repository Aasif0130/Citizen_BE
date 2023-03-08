package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Citizen;
import com.example.demo.Service.Cservice;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
public class Controller {
	@Autowired
	private Cservice cservice;
	
	@GetMapping ("/getAllCitizens")
	public List<Citizen>getDetails()
	{
		return cservice.getAllDetails();
	}
	@GetMapping("/getAid/{aid}")
	public Optional<Citizen> getDetails(@PathVariable long aid)
	{
		return cservice.getDetailsById(aid);
	}

	@PostMapping("/addC")
	public String postDetails (@RequestBody Citizen c)
	{
		return cservice.addDetails(c);
		
	}
	@PostMapping("/validate")
	public String validate (@RequestBody Citizen c)
	{
		return cservice.validate(c);
		
	}
	@PutMapping("/putAid/{aid}/{salary}")
	public Citizen putDetails (@PathVariable long aid,@PathVariable int salary)
	{
		return cservice.changeDetails(aid,salary);
	}
	
	@DeleteMapping("/del/{aid}")
	public String deletedetails(@PathVariable long aid)
	{
		return cservice.deleteDepartmentById(aid);
	}
}