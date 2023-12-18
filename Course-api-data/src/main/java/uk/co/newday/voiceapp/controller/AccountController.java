package uk.co.newday.voiceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.co.newday.voiceapp.models.AccountInquiry.AccountInquiryResponseDto;
import uk.co.newday.voiceapp.services.AccountInquiryServices;

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