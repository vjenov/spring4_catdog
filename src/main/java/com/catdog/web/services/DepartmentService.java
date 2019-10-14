package com.catdog.web.services;

import org.springframework.stereotype.Component;

import com.catdog.web.domains.EmployeeDTO;
@Component
public interface DepartmentService {
	public boolean join (EmployeeDTO param);
	public EmployeeDTO login(EmployeeDTO param);
}
