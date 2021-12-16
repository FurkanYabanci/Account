package com.yabanci.account;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yabanci.account.model.Customer;
import com.yabanci.account.repository.CustomerRepository;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner{

	private final CustomerRepository customerRepository;
	
	public AccountApplication(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = customerRepository.save(new Customer("Furkan", "Yabanci"));
		System.out.println(customer);
		
	}

}
