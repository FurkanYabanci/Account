package com.yabanci.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yabanci.account.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
