package com.yabanci.account.dto;

import org.springframework.stereotype.Component;

import com.yabanci.account.model.Transaction;

@Component
public class TransactionDtoConverter {

	public TransactionDto convert(Transaction from) {
		return new TransactionDto(from.getId(), from.getTransactionType(), from.getAmount(), from.getTransactionDate());
	}
}
