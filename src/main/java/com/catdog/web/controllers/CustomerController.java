package com.catdog.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.catdog.web.services.CustomerService;

@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	private static final Logger Logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired CustomerService customerService;
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = customerService.countCustomers();
		model.addAttribute("count", count);
		return "index";
	}
	
	
	@GetMapping("/info")
	public String findCustomerByCid(@RequestParam("cid") String cid, @RequestParam("pwd") String pwd) {
		return "index";
	}
}
