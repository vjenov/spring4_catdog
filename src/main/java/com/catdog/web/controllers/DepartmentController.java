package com.catdog.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.catdog.web.services.DepartmentService;

@Controller
public class DepartmentController {
	private static final Logger Logger = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired DepartmentService departmentService;
}
