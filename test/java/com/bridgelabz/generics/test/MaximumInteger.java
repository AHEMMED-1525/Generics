package com.bridgelabz.generics.test;

import org.junit.Assert;
import org.junit.Test;


public class MaximumInteger {
	// Test case 1.1
	@Test
	public void givenInteger_WhenProper_ReturnsFirstMaximum() {
		MaxInteger maxTest = new MaxInteger();
		boolean result1 = maxTest.MaxAtFirstPosition(90, 40, 50);
		Assert.assertEquals(true, result1);
	}
	// Test case 1.2
	@Test
	public void givenInteger_WhenProper_ReturnsSecondInteger() {
		MaxInteger maxTest = new MaxInteger();
		boolean result2 = maxTest.MaxAtSecondPosition(40, 80, 50);
		Assert.assertEquals(true, result2);
	}
	// Test case 1.3
	@Test
	public void givenInteger_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger();
		boolean result3 = maxTest.MaxAtThirdPosition(50, 60, 100);
		Assert.assertEquals(true, result3);
		
	}

}
