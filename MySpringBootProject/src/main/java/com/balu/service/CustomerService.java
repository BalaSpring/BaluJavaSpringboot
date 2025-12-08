package com.balu.service;

import com.balu.dto.CustomerDto;

public interface CustomerService {
	
	public CustomerDto getCustomer(int customerId);

	public CustomerDto addCustomer(CustomerDto customerDto);

}
