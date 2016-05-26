package com.comcast.qa.coding.task.taxperson;

public class LuxuryItemTaxCaluculator implements TaxCaluculator {

	private static final float TAX_PERCENTAGE = 1.09f; 
	
	public long getTotalCost(long costBeforeTaxInCents) {

		if(costBeforeTaxInCents <= 0) {
			throw new RuntimeException("Invalid item price. Price should be greater than 0");
		}
		
		return Math.round(costBeforeTaxInCents*(TAX_PERCENTAGE));
	
	}

}
