package com.yabanci.account.dto;

import java.math.BigDecimal;

public class CreateAccountRequest {

	private String customerId;
	private BigDecimal initialCredit;
	
	public String getCustomerId() {
		return customerId;
	}
	public BigDecimal getInitialCredit() {
		return initialCredit;
	}
	
	
	
}
