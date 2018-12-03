package com.infosys.service;

import java.util.Optional;

import com.infosys.persistence.domain.Account;

public interface AccountService {
	
	Optional<Account> get (Long id);
	
	Iterable<Account> getAll();
	
	Account add(Account account);
	
	void delete(Long id);
	

}
