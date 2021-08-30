package com.greatlearning.dp3;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String type = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter currency to be converted in");
		type = sc.next();
		System.out.println("Enter amount to be converted");
		double amount = sc.nextDouble();
		
		CurrencyConverter currencyConverter;
		
		if(type.equals("USD")) {
			currencyConverter = new USDConverter();
		}else {
			currencyConverter = new GBPConverter();
		}
		
		double result = currencyConverter.convertToINR(amount);
		
		System.out.println(result);
		
	}
}
