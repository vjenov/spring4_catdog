package com.catdog.web.services;

import org.springframework.stereotype.Component;
import com.catdog.web.domains.AdminDTO;
@Component
public interface AdminService {
	public AdminDTO login(AdminDTO param);
	public void join(AdminDTO param);
}
