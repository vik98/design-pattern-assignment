package com.greatlearning.dp2;

import java.util.List;

public class BankBuilder {
	
	public Bank bank;
	
	public Bank build() {
		return bank;
	}
	
	public BankBuilder() {
		bank = new Bank();
	}
	
	public BankBuilder setBankAccountNumber(int bankAccountNumber) {
		bank.bankAccountNumber = bankAccountNumber;
		return this;
	}
	
	public BankBuilder setAccountType(String accountType) {
		bank.accountType = accountType;
		return this;
	}
	
	public BankBuilder setBranch(String branch) {
		bank.branch = branch;
		return this;
	}
	
	public BankBuilder setBalance(String balance) {
		bank.balance = balance;
		return this;
	}
	
	public BankBuilder setListOfTransactions(List<Integer> listOfTransactions) {
		bank.listOfTransactions = listOfTransactions;
		return this;
	}
	
	public BankBuilder setEmiSchedule(int emiSchedule) {
		bank.emiSchedule = emiSchedule;
		return this;
	}
	
}
