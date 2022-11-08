package com.oriented.opps;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
     
	BigDecimal principal; 
	BigDecimal interest;
	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		// TODO Auto-generated constructor stub
	}
	public BigDecimal calculateTotalValue(int noOfYears) {
		// TODO Auto-generated method stub
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
				.multiply (noOfYearsBigDecimal));
		return totalValue;
	}

}
