package com.company.web.serviceimpls;

import com.company.web.domains.EmployeeBean;
import com.company.web.services.CompanyService;

public class CompanyServiceImpl implements CompanyService{
	private static CompanyServiceImpl instance =  new CompanyServiceImpl();
	
	public static CompanyServiceImpl getInstance() {
		return instance;
	}
	private CompanyServiceImpl() {}

	@Override
	public boolean join(EmployeeBean param) {
		System.out.println(6);
		return false;
	}

	@Override
	public EmployeeBean login(EmployeeBean param) {
		return null;
	}

}
