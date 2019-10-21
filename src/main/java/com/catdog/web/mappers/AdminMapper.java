package com.catdog.web.mappers;

import org.springframework.stereotype.Repository;

import com.catdog.web.domains.AdminDTO;
@Repository
public interface AdminMapper {
	public AdminDTO selectAdminById(AdminDTO param);
	public void insertAdmin(AdminDTO param);
}
