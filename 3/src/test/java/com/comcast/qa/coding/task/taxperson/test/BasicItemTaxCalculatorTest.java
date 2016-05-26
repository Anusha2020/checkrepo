package com.comcast.qa.coding.task.taxperson.test;

import org.junit.Assert;
import org.junit.Test;

import com.comcast.qa.coding.task.taxperson.TaxCaluculator;
import com.comcast.qa.coding.task.taxperson.TaxCaluculatorFactory;

public class BasicItemTaxCalculatorTest {

	@Test
	public void testBasicItemTaxCalculator() {
		
		TaxCaluculatorFactory factory = new TaxCaluculatorFactory();
		
		TaxCaluculator taxCaluculator = factory.getTaxCaluculator("BASIC");
		
		long itemPrice = 1000;
		double expected = 1010;
		double acutal = taxCaluculator.getTotalCost(itemPrice);
		
		Assert.assertEquals(expected, acutal, 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testBasicItemTaxCalculatorForException() {
		
		TaxCaluculatorFactory factory = new TaxCaluculatorFactory();
		
		TaxCaluculator taxCaluculator = factory.getTaxCaluculator("BASIC");
		
		long itemPrice = -1000;
		taxCaluculator.getTotalCost(itemPrice);
		
	}
	
}
