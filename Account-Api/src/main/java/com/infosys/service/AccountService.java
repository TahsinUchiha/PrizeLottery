package com.infosys.service;

import java.util.Optional;

import com.infosys.persistence.domain.Account;
import com.infosys.persistence.domain.Prize;

public interface AccountService {
	
	Optional<Account> get (Long id);
	
	Iterable<Account> getAll();
	
	Account add(Account account);
	
	void delete(Long id);

	Prize prizeCheck(String accountNumber);
	

}
