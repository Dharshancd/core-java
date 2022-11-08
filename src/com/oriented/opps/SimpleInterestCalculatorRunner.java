package com.oriented.opps;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator =
				new SimpleInterestCalculator("320000.00","11.0");
		 BigDecimal totalValue =
				 calculator.calculateTotalValue(9);
		 System.out.println(totalValue);

	}

}
