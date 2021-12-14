package com.yabanci.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yabanci.account.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String>{

}
