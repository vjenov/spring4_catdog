package com.catdog.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.catdog.web.domains.AdminDTO;
import com.catdog.web.serviceimpls.AdminServiceImpl;



@Controller
@RequestMapping("/admin/*")
public class AdminController {
	private static final Logger Logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired AdminDTO admin;
	@Autowired AdminServiceImpl adminService;
	@PostMapping("/join")
	public @ResponseBody AdminDTO join(@RequestBody AdminDTO param) {
		Logger.info("AJAX가 보낸 아이디 & 비번 {}", param.getAid()+", "+ param.getPwd()+", "+ param.getPname());
		admin.setAid(param.getAid());
		admin.setPwd(param.getPwd());
		admin.setPname(param.getPname());
		adminService.join(admin);
		return admin;
	}
	@PostMapping("/login")
	public @ResponseBody AdminDTO login(@RequestBody AdminDTO param) {
		admin.setAid(param.getAid());
		admin.setPwd(param.getPwd());
		admin.setPname(param.getPname());
		Logger.info("AJAX가 보낸 아이디 & 비번 {}", param.getAid()+", "+ param.getPwd());
		Logger.info("map에 담긴 아이디 & 비번", admin.getAid()+", " + admin.getPwd());
		return adminService.login(admin);
	}
}
