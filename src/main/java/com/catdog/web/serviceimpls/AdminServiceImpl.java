package com.catdog.web.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catdog.web.domains.AdminDTO;
import com.catdog.web.mappers.AdminMapper;
import com.catdog.web.services.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminMapper adminMapper;
	@Override
	public AdminDTO login(AdminDTO param) {
		return adminMapper.selectAdminById(param);
	}
	@Override
	public void join(AdminDTO param) {
		adminMapper.insertAdmin(param);
	}
}
