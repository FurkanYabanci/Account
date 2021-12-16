package com.yabanci.account.dto;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.yabanci.account.model.Customer;

@Component
public class CustomerDtoConverter {

	private final CustomerAccountDtoConverter customerAccountDtoConverter;
	
	public CustomerDtoConverter(CustomerAccountDtoConverter customerAccountDtoConverter) {
		super();
		this.customerAccountDtoConverter = customerAccountDtoConverter;
	}

	public AccountCustomerDto convertToAccountCustomer(Customer from) {
		if (from == null) {
			return new AccountCustomerDto("","","");
		}
		return new AccountCustomerDto(
				from.getId(), 
				from.getName(),
				from.getSurname());
	}
	
	public CustomerDto convertToCustomerDto(Customer from) {
		return new CustomerDto(
				from.getId(), 
				from.getName(), 
				from.getSurname(), 
				from.getAccounts().stream().map(customerAccountDtoConverter::convert).collect(Collectors.toSet()));
	}
}
