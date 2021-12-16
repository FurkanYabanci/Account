package com.yabanci.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class AccountDto {

	private String id;
	private BigDecimal balance;
	private LocalDateTime creationDate;
	private AccountCustomerDto customer;
	private Set<TransactionDto> transactions;

	public AccountDto(String id, BigDecimal balance, LocalDateTime creationDate, AccountCustomerDto customer,
			Set<TransactionDto> transactions) {
		super();
		this.id = id;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customer = customer;
		this.transactions = transactions;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public AccountCustomerDto getCustomer() {
		return customer;
	}

	public Set<TransactionDto> getTransactions() {
		return transactions;
	}
	
	
}
