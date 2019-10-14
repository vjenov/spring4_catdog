package com.catdog.web.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catdog.web.domains.EmployeeDTO;
import com.catdog.web.mappers.DepartmentMapper;
import com.catdog.web.services.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired	DepartmentMapper mapper;
	@Override
	public boolean join(EmployeeDTO param) {
		System.out.println("서비스조인====");
		return false;
		
	}

	@Override
	public EmployeeDTO login(EmployeeDTO param) {
		return null;
	}

}
