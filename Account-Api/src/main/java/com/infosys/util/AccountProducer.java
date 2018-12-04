package com.infosys.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jms.core.JmsTemplate;

import com.infosys.persistence.domain.Account;
import com.infosys.persistence.domain.Accounts;

@Component
public class AccountProducer {
	
	private Accounts pojoAccount = new Accounts();
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public String produce(Account account) {
		pojoAccount.setAccount(account.toString());
		jmsTemplate.convertAndSend("Audit", pojoAccount);
		return "";
	}
	
	
	

}
