package com.yabanci.account.dto;

import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.yabanci.account.model.Account;

@Component
public class CustomerAccountDtoConverter {
	
	private final TransactionDtoConverter transactionDtoConverter;

	public CustomerAccountDtoConverter(TransactionDtoConverter transactionDtoConverter) {
		super();
		this.transactionDtoConverter = transactionDtoConverter;
	}
	
	public CustomerAccountDto convert(Account from) {
		return new CustomerAccountDto(
				Objects.requireNonNull(from.getId()),
				from.getBalance(),
				from.getTransactions().stream().map(t -> transactionDtoConverter.convert(t)).collect(Collectors.toSet()),
				from.getCreationDate());
	}
}
