package com.yabanci.account.dto;

public class AccountCustomerDto {

	private String id;
	private String name;
	private String surname;
	
	public AccountCustomerDto() {
		// TODO Auto-generated constructor stub
	}

	public AccountCustomerDto(String id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
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
}
