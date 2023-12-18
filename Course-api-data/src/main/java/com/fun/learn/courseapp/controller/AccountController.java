package com.fun.learn.courseapp.controller;

import com.fun.learn.courseapp.models.AccountInquiry.AccountInquiryResponseDto;
import com.fun.learn.courseapp.services.AccountInquiryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class AccountController {
	
	@Autowired
	private AccountInquiryServices accountInquiryServices;
	
	@RequestMapping("/AccountInquiry")
	public AccountInquiryResponseDto getAccountInquiry() {
		//AccountInquiryResponseDto accountInquiryResponseDto = new AccountInquiryResponseDto("1236", "7412", 10.20);
		
		return accountInquiryServices.getAccountData();
	}
	
	@RequestMapping("/AccountInquiry/{accountNumber}")
	public double getBalanceForAccountNumber(@PathVariable String accountNumber) {
		
		return accountInquiryServices.getCurrentBalance();	
	}
	
}