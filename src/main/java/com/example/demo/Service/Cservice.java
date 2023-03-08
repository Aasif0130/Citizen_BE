package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Citizen;
import com.example.demo.Repository.Crepo;

@Service
public class Cservice {
	@Autowired
	private Crepo Crepo;
	
	public String addDetails(Citizen c)
	{
		 Crepo.save(c);
		 return "Signup Successful";
		 
	}
	public List<Citizen>getAllDetails()
	{
		return Crepo.findAll();
	}
	public Optional<Citizen> getDetailsById(long aid) 
	{
		return Crepo.findById(aid);
	}
	public Citizen changeDetails(long aid,int salary)
	{
		Citizen cc = Crepo.findById(aid).orElse(null);
		

		cc.setCsalary(salary);

		return Crepo.saveAndFlush(cc);
	}
	public String deleteDepartmentById(long aid)
	{
		Crepo.deleteById(aid);
		return "deleted";
	}
	public List<Citizen> getAllSorted(String field){
		return Crepo.findAll(Sort.by(field));
	}

	public String validate(Citizen c) {
		Optional<Citizen> c1 = Crepo.findById(c.getAid());
		if(c1 == null) {
			return "Email not found";
		}
		if(c.getpassword().equals(c1.getpassword())) {
			return "Login Successful";
		}
		return "Login Failed";
	
	}
	
}