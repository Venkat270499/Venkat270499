package com.nt.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/application-api")
public class MyFirstRestController {

	@GetMapping("/report")
	public ResponseEntity<List<Customer>> display(){
		
		Customer cust=new Customer(416,"venkat","DSNR",9063789805L);
		Customer cust1=new Customer(417,"Kiran","Meerpet",9063789806L);
		Customer cust2=new Customer(418,"Raghu","Ameerpet",9063789807L);
		List<Customer> list=List.of(cust,cust1,cust2);
		//System.out.println(c.toString()+" "+name);
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/reportpost")
public ResponseEntity<List<Customer>> displaypost(@RequestBody List<Customer> ctr){
		
		Customer cust=new Customer(416,"venkat","DSNR",9063789805L);
		Customer cust1=new Customer(417,"Kiran","Meerpet",9063789806L);
		Customer cust2=new Customer(418,"Raghu","Ameerpet",9063789807L);
		List<Customer> list=List.of(cust,cust1,cust2);
		System.out.println(ctr.toString());
		
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/pathvar/{no}/{name}")
	public ResponseEntity<String> pathvarmet(@PathVariable int no,@PathVariable String name){
		return new ResponseEntity<String>(no+" "+name,HttpStatus.OK);
	}
	
	
}

