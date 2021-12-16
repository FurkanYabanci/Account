package com.yabanci.account.dto;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.yabanci.account.model.Account;

@Component
public class AccountDtoConverter {

	private final CustomerDtoConverter customerDtoConverter;
	private final TransactionDtoConverter transactionDtoConverter;

	public AccountDtoConverter(CustomerDtoConverter customerDtoConverter,
			TransactionDtoConverter transactionDtoConverter) {
		super();
		this.customerDtoConverter = customerDtoConverter;
		this.transactionDtoConverter = transactionDtoConverter;
	}

	public AccountDto convert(Account from) {
		return new AccountDto(from.getId(), 
				from.getBalance(), 
				from.getCreationDate(),
				customerDtoConverter.convertToAccountCustomer(from.getCustomer()),
				from.getTransactions()
						.stream()
						.map(t -> transactionDtoConverter.convert(t))
						.collect(Collectors.toSet()));
	}
}