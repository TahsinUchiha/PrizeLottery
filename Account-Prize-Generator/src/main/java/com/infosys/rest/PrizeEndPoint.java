package com.infosys.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.domain.Prize;
import com.infosys.service.PrizeService;

@RestController
public class PrizeEndPoint {
	
	@Autowired
	PrizeService service;
	
	@RequestMapping("getPrize/{accountNumber}")
	public Prize getPrize(@PathVariable String accountNumber) {
		Prize prize = service.getPrize(accountNumber);
		return prize;
	}

}
