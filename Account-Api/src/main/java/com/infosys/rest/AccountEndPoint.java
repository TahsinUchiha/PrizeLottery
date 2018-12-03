package com.infosys.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.persistence.domain.Account;
import com.infosys.service.AccountService;

@RequestMapping("/accounts")
@RestController
public class AccountEndPoint {
	
	
	//rest-template is used to link with another api

	
	@Autowired
	private AccountService service;

	@GetMapping("/getAllAccounts")
	public Iterable<Account> getAllAccounts() {
		return service.getAll();
	}
	
	@GetMapping("/getAccount/{id}")
	public Optional<Account> getAccount(@PathVariable Long id) {
		return service.get(id);
	}
	
	
	@PostMapping("/addAccount")
	@ResponseStatus(HttpStatus.OK)
	public Account addAccount(@RequestBody Account account) {
		return service.add(account);
	}
	
	@DeleteMapping("/deleteAccount/{id}")
	public void deleteAccount(@PathVariable Long id) {
		service.delete(id);
	}
	
}
