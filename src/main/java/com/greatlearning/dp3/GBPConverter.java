package com.greatlearning.dp3;

public class GBPConverter implements CurrencyConverter{

	private final double GBP_RATE = 22;
	
	public double convertToINR(double amount) {
		// TODO Auto-generated method stub
		return GBP_RATE*amount;
	}

}
