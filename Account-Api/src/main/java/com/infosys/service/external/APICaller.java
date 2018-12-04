package com.infosys.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.infosys.persistence.domain.Account;
import com.infosys.persistence.domain.Prize;
import com.infosys.util.AccountProducer;

@Component
public class APICaller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AccountProducer producer;
	
	@Value("http://account-number-generator:8080/" + "generate")
	private String accountURL;
	
	@Value("http://account-prize-generator:8080/" + "getPrize/")
	private String offerURL;
	
	public String getAccountNumber() {
		return restTemplate.getForObject(accountURL, String.class);
	}
	
	public Prize getPrize(String accountNumber) {
		return restTemplate.getForObject(offerURL + accountNumber, Prize.class);
	}
	
	public void persist(Account account) {
		producer.produce(account);
	}

}
