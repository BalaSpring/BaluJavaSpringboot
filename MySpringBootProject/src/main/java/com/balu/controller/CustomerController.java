package com.balu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balu.dto.CustomerDto;
import com.balu.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable int id) {
		
		CustomerDto customer  = customerService.getCustomer(id);
		
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<CustomerDto> addCustomer(@RequestBody CustomerDto customerDto) {
		
		CustomerDto addedCustomer = customerService.addCustomer(customerDto);
		
		return new ResponseEntity<>(addedCustomer,HttpStatus.CREATED);
	}

}
