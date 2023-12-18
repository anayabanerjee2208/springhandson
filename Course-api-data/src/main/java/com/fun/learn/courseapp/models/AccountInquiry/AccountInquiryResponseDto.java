package com.fun.learn.courseapp.models.AccountInquiry;

public class AccountInquiryResponseDto {
private String accountNumber;
private String customerNumber;
private double currentBalance;

public AccountInquiryResponseDto(String accountNumber, String customerNumber, double currentBalance) {
	super();
	this.accountNumber = accountNumber;
	this.customerNumber = customerNumber;
	this.currentBalance = currentBalance;
}
public AccountInquiryResponseDto() {
}

public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(String customerNumber) {
	this.customerNumber = customerNumber;
}
public double getCurrentBalance() {
	return currentBalance;
}
public void setCurrentBalance(double currentBalance) {
	this.currentBalance = currentBalance;
}
}
