package com.yabanci.account.service;

import org.springframework.stereotype.Service;

import com.yabanci.account.dto.CustomerDto;
import com.yabanci.account.dto.CustomerDtoConverter;
import com.yabanci.account.exception.CustomerNotFoundException;
import com.yabanci.account.model.Customer;
import com.yabanci.account.repository.CustomerRepository;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;
	private final CustomerDtoConverter customerDtoConverter;


	public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter customerDtoConverter) {
		super();
		this.customerRepository = customerRepository;
		this.customerDtoConverter = customerDtoConverter;
	}

	protected Customer findCustomerById(String id) 
	{
		return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer could not found by id: " + id));
	}

	public CustomerDto getCustomerById(String customerId) {
		return customerDtoConverter.convertToCustomerDto(findCustomerById(customerId));
	}
	
}
