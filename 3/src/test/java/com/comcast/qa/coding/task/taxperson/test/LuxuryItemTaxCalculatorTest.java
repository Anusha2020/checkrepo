package com.comcast.qa.coding.task.taxperson.test;

import org.junit.Assert;
import org.junit.Test;

import com.comcast.qa.coding.task.taxperson.TaxCaluculator;
import com.comcast.qa.coding.task.taxperson.TaxCaluculatorFactory;

public class LuxuryItemTaxCalculatorTest {

	@Test
	public void testLuxuryItemTaxCalculator() {
		
		TaxCaluculatorFactory factory = new TaxCaluculatorFactory();
		
		TaxCaluculator taxCaluculator = factory.getTaxCaluculator("LUXURY");
		
		long itemPrice = 1000;
		double expected = 1090;
		double acutal = taxCaluculator.getTotalCost(itemPrice);
		
		Assert.assertEquals(expected, acutal, 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testLuxuryItemTaxCalculatorForException() {
		
		TaxCaluculatorFactory factory = new TaxCaluculatorFactory();
		
		TaxCaluculator taxCaluculator = factory.getTaxCaluculator("LUXURY");
		
		long itemPrice = -1000;
		taxCaluculator.getTotalCost(itemPrice);
		
	}
	
}
