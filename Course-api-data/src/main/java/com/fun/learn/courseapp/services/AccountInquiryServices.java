package com.fun.learn.courseapp.services;

import com.fun.learn.courseapp.models.AccountInquiry.AccountInquiryResponseDto;
import org.springframework.stereotype.Service;

@Service
public class AccountInquiryServices {
	
	private AccountInquiryResponseDto accountInquiryResponseDto = new AccountInquiryResponseDto("1236", "7412", 10.20);

	public AccountInquiryResponseDto getAccountData() {
		
		return accountInquiryResponseDto;
	}
	
	public double getCurrentBalance() {
		return accountInquiryResponseDto.getCurrentBalance();
	}
}
