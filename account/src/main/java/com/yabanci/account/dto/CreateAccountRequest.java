package com.yabanci.account.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CreateAccountRequest {

	@NotBlank
	private String customerId;
	@Min(value = 0)
	private BigDecimal initialCredit;
	
	public String getCustomerId() {
		return customerId;
	}
	public BigDecimal getInitialCredit() {
		return initialCredit;
	}
	
	
	
}
