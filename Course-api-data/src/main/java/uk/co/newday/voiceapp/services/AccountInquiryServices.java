package uk.co.newday.voiceapp.services;

import org.springframework.stereotype.Service;

import uk.co.newday.voiceapp.models.AccountInquiry.AccountInquiryResponseDto;

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
