package com.infosys.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.persistence.domain.Account;
import com.infosys.persistence.domain.Prize;
import com.infosys.persistence.repository.AccountRepository;
import com.infosys.service.external.APICaller;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepo;
	
	@Autowired
	private APICaller external;

	@Override
	public Optional<Account> get(Long id) {
		// TODO Auto-generated method stub
		return accountRepo.findById(id);
	}

	public Iterable<Account> getAll() {
		// TODO Auto-generated method stub
		return accountRepo.findAll();
	}


	public Account add(Account account) {
		account.setAccountNumber(external.getAccountNumber());
		account.setPrize(external.getPrize(account.getAccountNumber()));
		external.persist(account);
		// TODO Auto-generated method stub
		return accountRepo.save(account);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accountRepo.deleteById(id);
	}

	public Prize prizeCheck(String accountNumber) {
		return external.getPrize(accountNumber);
	}
	
	
}
