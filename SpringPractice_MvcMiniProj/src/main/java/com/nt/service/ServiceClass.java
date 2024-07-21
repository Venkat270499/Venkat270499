package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.CustomerClass;
import com.nt.repository.ICustomerRepo;

@Service
public class ServiceClass {
	@Autowired
	ICustomerRepo repo;
	
	public List<CustomerClass> findAllcustomers(){
		
		return repo.findAll();
	}
	
	public String SaveCustomer(CustomerClass cu) {
		List<CustomerClass> lst=repo.findAll();
		
		repo.save(cu);
		
		if(lst.contains(cu)) {
			return "Customer Updated sucessfully";
		}
		
		
		return "Customer saved sucessfully";
	}
	
	public CustomerClass findCustById(int id) {
		return repo.getById(id);
	}
	
	public String deleteCustById(int no) {
		repo.deleteById(no);
		
		return "Customer Deleted Sucessfully";
	}
	
}
