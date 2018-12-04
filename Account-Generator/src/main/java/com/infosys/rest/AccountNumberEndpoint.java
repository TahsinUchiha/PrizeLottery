package com.infosys.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.service.AccountNumberService;

@RestController
public class AccountNumberEndpoint {

	@Autowired
	AccountNumberService service;
	
	@RequestMapping("/generate")
	public String accountNumber() {
		return service.generateAccountNumber();
	}
	
}
