package com.greatlearning.dp2;

import java.util.List;

public class Bank {
	int bankAccountNumber;
	String accountType;
	String branch;
	String balance;
	List<Integer> listOfTransactions;
	int emiSchedule;
	
	public Bank(BankBuilder bankBuilder) {
		
	}
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public List<Integer> getListOfTransactions() {
		return listOfTransactions;
	}
	public void setListOfTransactions(List<Integer> listOfTransactions) {
		this.listOfTransactions = listOfTransactions;
	}
	public int getEmiSchedule() {
		return emiSchedule;
	}
	public void setEmiSchedule(int emiSchedule) {
		this.emiSchedule = emiSchedule;
	}

	@Override
	public String toString() {
		return "Bank [bankAccountNumber=" + bankAccountNumber + ", accountType=" + accountType + ", branch=" + branch
				+ ", balance=" + balance + ", listOfTransactions=" + listOfTransactions + ", emiSchedule=" + emiSchedule
				+ "]";
	}
	
	
	
}
