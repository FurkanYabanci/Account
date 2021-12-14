package com.yabanci.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yabanci.account.model.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
