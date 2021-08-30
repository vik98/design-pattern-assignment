package com.greatlearning.dp3;

public class USDConverter implements CurrencyConverter{

	private final double USD_RATE = 73;
	
	public double convertToINR(double amount) {
		// TODO Auto-generated method stub
		return USD_RATE * amount;
	}

}
