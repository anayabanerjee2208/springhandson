package com.fun.learn.courseapp.models.DirectDebitUpdate;

public class UpdateDirectDebitRequestDto {
	
	private String accountNumber;
	private String directDebitType;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDirectDebitType() {
		return directDebitType;
	}
	public void setDirectDebitType(String directDebitType) {
		this.directDebitType = directDebitType;
	}	
}
