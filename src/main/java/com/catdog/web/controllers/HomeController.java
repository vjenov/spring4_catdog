package com.catdog.web.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.catdog.web.serviceimpls.CustomerServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired CustomerServiceImpl customerService;
	
	/* @RequestMapping(value = "/", method = RequestMethod.GET) */
	@GetMapping("/") // 스프링 4.3버전 이후부터 나온 문법으로 위와 같은 기능
	public String home(Locale locale, Model model) {
		logger.info("Welcome {}!", "HomeController");
		return "index";
	}
	
}
