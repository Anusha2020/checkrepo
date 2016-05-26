package com.comcast.qa.coding.task.taxperson;

public class TaxCaluculatorFactory {

	public TaxCaluculator getTaxCaluculator(String itemType) {
		if(itemType.equalsIgnoreCase("BASIC")) {
			return new BasicItemTaxCaluculator();
		} else if(itemType.equalsIgnoreCase("LUXURY")) {
			return new LuxuryItemTaxCaluculator();
		}
		return null;
	}
	
}
