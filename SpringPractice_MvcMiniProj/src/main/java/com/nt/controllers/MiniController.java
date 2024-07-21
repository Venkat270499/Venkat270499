package com.nt.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.CustomerClass;
import com.nt.service.ServiceClass;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MiniController {
	
	@Autowired
	ServiceClass sc;
	
	
	@GetMapping("/")
	public String welocomePage() {
		return "welcome"; 
	}  
	
	@GetMapping("/showusers")
	public String showuserspage(Map<String, Object> mp) {
		
		List<CustomerClass> lst=sc.findAllcustomers();
		
		lst.forEach(l->System.out.println(l));
		mp.put("culist", lst);
		return "show_user";
	} 
	
	@GetMapping("/registeruser")
	public String registercustomer(@ModelAttribute("cust") CustomerClass cu) {
		return "Register_User";
	}
	
	@PostMapping("/registeruser") 
	public String postRegistercu(@ModelAttribute("cust") CustomerClass cu,Map<String,Object> mp, RedirectAttributes att) {
		
		
		String s=sc.SaveCustomer(cu); 
		//mp.put("msg",s); 
		
		att.addFlashAttribute("msgAtt", s);
		return "redirect:cust_report";
		
	}
	
	@GetMapping("/cust_report")
	public String showCustReport(Map<String,Object> mp) {
		
		List<CustomerClass> lst=sc.findAllcustomers();
		
		mp.put("culist", lst);
		return "show_user";   
	}
	
	@GetMapping("/edit") 
	public String editCustomer(@ModelAttribute("cust") CustomerClass cu,@RequestParam("no") int no) {
		CustomerClass custcu=sc.findCustById(no);
		BeanUtils.copyProperties(custcu, cu);	
		return "Edit_Page";
	}
	
	@PostMapping("/edit")
	public String editPostCustomer(@ModelAttribute("cust") CustomerClass cu,RedirectAttributes att) {
		String s=sc.SaveCustomer(cu); 
		//mp.put("msg",s); 
		
		att.addFlashAttribute("msgAtt", s);
		return "redirect:cust_report";
	}
	@GetMapping("/delete")
	public String deleteCust(@RequestParam("no") int no, RedirectAttributes att) {
		String s=sc.deleteCustById(no);
		att.addFlashAttribute("deleteMsg", s);
		return "redirect:cust_report";
	}
}
