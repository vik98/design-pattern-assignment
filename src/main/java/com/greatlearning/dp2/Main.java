package com.greatlearning.dp2;

public class Main {
	public static void main(String args[]) {
		Bank bank=new BankBuilder().setAccountType("Savings").setBalance("123").setBankAccountNumber(133).build();
		System.out.println(bank);
	}
}
