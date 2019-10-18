package com.catdog.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.catdog.web.domains.AdminDTO;



@Controller
@RequestMapping("/admin/*")
public class AdminController {
	private static final Logger Logger = LoggerFactory.getLogger(AdminController.class);
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody AdminDTO admin) {
		Logger.info("AJAX가 보낸 아이디 & 비번 {}", admin.getAid()+", "+ admin.getPwd());
		HashMap<String, Object> map = new HashMap<>();
		map.put("aid", admin.getAid());
		map.put("pwd", admin.getPwd());
		Logger.info("map에 담긴 아이디 & 비번", map.get("aid")+", " + map.get("pwd"));
		return map;
	}
}
