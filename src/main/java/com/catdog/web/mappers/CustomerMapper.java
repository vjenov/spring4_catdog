package com.catdog.web.mappers;
import com.catdog.web.domains.CustomerDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
	public boolean insertCustomer(CustomerDTO param);
	public int countCustomers();
	public CustomerDTO selectByEmpnoEname(CustomerDTO param);
}
