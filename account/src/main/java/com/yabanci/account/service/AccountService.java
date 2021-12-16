package com.yabanci.account.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.yabanci.account.dto.AccountDto;
import com.yabanci.account.dto.AccountDtoConverter;
import com.yabanci.account.dto.CreateAccountRequest;
import com.yabanci.account.model.Account;
import com.yabanci.account.model.Customer;
import com.yabanci.account.model.Transaction;
import com.yabanci.account.repository.AccountRepository;

@Service
public class AccountService {

	private final AccountRepository accountRepository;
	private final CustomerService customerService;
	private final AccountDtoConverter accountDtoConverter;
	
	public AccountService(AccountRepository accountRepository, 
			CustomerService customerService,
			AccountDtoConverter accountDtoConverter) {
		super();
		this.accountRepository = accountRepository;
		this.customerService = customerService;
		this.accountDtoConverter = accountDtoConverter;
	}



	public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
		Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());
		
		Account account = new Account(
				createAccountRequest.getInitialCredit(),
				LocalDateTime.now() , 
				customer);
		if (createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO) > 0) {
			Transaction transaction = new Transaction(createAccountRequest.getInitialCredit(),account);
			account.getTransactions().add(transaction);
		} 
		return accountDtoConverter.convert(accountRepository.save(account)); 
	}
	
}
