package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.util.LetterGenerator;
import com.infosys.util.NumberGenerator;

@Service
public class AccountNumberServiceImpl implements AccountNumberService {

	@Autowired
	NumberGenerator numberGenerator;
	
	@Autowired
	LetterGenerator letterGenerator;
	
	/* (non-Javadoc)
	 * @see com.infosys.service.AccountNumberService#generateAccountNumber()
	 */
	@Override
	public String generateAccountNumber() {
		return letterGenerator.letterGenerator() + numberGenerator.accountNumberGenerator();
	}
	
	
}
