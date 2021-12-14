package com.yabanci.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.yabanci.account.model.TransactionType;

public class TransactionDto {

	private String id;
	private TransactionType transactionType = TransactionType.INITIAL;
	private BigDecimal amount;
	private LocalDateTime transactionDate;
	
	public TransactionDto(TransactionType transactionType, BigDecimal amount, LocalDateTime transactionDate) {
		super();
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
}
