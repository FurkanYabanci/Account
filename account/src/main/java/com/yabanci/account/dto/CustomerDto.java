package com.yabanci.account.dto;

import java.util.Set;

public class CustomerDto {
	
	private String id;
	private String name;
	private String surname;
	private Set<CustomerAccountDto> accounts;
	
	public CustomerDto(String id, String name, String surname, Set<CustomerAccountDto> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.accounts = accounts;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Set<CustomerAccountDto> getAccounts() {
		return accounts;
	}

	

}
