package com.balu.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balu.dto.CustomerDto;
import com.balu.model.Customer;
import com.balu.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CustomerDto getCustomer(int customerId) {
		
		Customer customer = customerRepo.findById(customerId).get();
		return entityToDto(customer);
	}

	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		//Customer customer = this.dtoToEntity(customerDto);
		Customer customer = modelMapper.map(customerDto, Customer.class);
		Customer addedCustomer = customerRepo.save(customer);
		return entityToDto(addedCustomer);
	}
	
	/*
	 * private Customer dtoToEntity(CustomerDto customerDto) { Customer customer =
	 * new Customer(); customer.setCustomerName(customerDto.getName());
	 * customer.setAddress(customerDto.getAddress());
	 * 
	 * return customer; }
	 */
	
	private CustomerDto entityToDto(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(customer.getCustomerId());
		customerDto.setName(customer.getCustomerName());
		customerDto.setAddress(customer.getAddress());
		return customerDto;
	}

}
