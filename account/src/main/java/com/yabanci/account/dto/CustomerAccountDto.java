package com.yabanci.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class CustomerAccountDto {

	private String id;
	private BigDecimal balance = BigDecimal.ZERO;
	private Set<TransactionDto> transactions;
	private LocalDateTime creationDate;
	
	public CustomerAccountDto(BigDecimal balance, LocalDateTime creationDate) {
		super();
		this.balance = balance;
		this.creationDate = creationDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Set<TransactionDto> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<TransactionDto> transactions) {
		this.transactions = transactions;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	} 
	
	
	
}
