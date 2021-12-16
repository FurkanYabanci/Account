package com.yabanci.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class CustomerAccountDto {

	private String id;
	private BigDecimal balance = BigDecimal.ZERO;
	private Set<TransactionDto> transactions;
	private LocalDateTime creationDate;

	public CustomerAccountDto(String id, BigDecimal balance, Set<TransactionDto> transactions,
			LocalDateTime creationDate) {
		super();
		this.id = id;
		this.balance = balance;
		this.transactions = transactions;
		this.creationDate = creationDate;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public Set<TransactionDto> getTransactions() {
		return transactions;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

}
