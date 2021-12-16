package com.yabanci.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yabanci.account.dto.AccountDto;
import com.yabanci.account.dto.CreateAccountRequest;
import com.yabanci.account.service.AccountService;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@PostMapping
	public ResponseEntity<AccountDto> createAccount(@RequestBody CreateAccountRequest createAccountRequest){
		return ResponseEntity.ok(accountService.createAccount(createAccountRequest));
	}
}
