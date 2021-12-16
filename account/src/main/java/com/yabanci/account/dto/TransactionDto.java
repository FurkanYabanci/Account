package com.yabanci.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.yabanci.account.model.TransactionType;

public class TransactionDto {

	private String id;
	private TransactionType transactionType = TransactionType.INITIAL;
	private BigDecimal amount;
	private LocalDateTime transactionDate;

	public TransactionDto(String id, TransactionType transactionType, BigDecimal amount,
			LocalDateTime transactionDate) {
		super();
		this.id = id;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}

	public String getId() {
		return id;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
}
