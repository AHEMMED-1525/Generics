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
		boolean result2 = maxTest.MaxAtFirstPosition(40, 80, 50);
		Assert.assertEquals(true, result2);
	}
	// Test case 1.3
	@Test
	public void givenInteger_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger();
		boolean result3 = maxTest.MaxAtFirstPosition(50, 60, 100);
		Assert.assertEquals(true, result3);	
	}
	// User cases 2 maximum Float value
	// test case 2.1
	@Test
	public void givenFloatValue_WhenProper_ReturnFirstMaximum() {
		MaxInteger maxTest = new MaxInteger();
		boolean FloatResult = maxTest.maxFloatValuePosition(15.214f, 8.541f, 10.54f);
		Assert.assertEquals(true, FloatResult);
	}
	// Test case 2.2
	@Test
	public void givenFloatValue_WhenProper_ReturnSecondMaximum() {
		MaxInteger maxTest = new MaxInteger();
		boolean FloatResult = maxTest.maxFloatValuePosition(15.214f, 18.541f, 10.54f);
		Assert.assertEquals(true, FloatResult);
	}
	// Test case 2.3
	@Test
	public void givenFloatValue_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger();
		boolean FloatResult = maxTest.maxFloatValuePosition(15.214f, 18.541f, 20.54f);
		Assert.assertEquals(true, FloatResult);
	}
	// test case 3
	// test case 3.1
	@Test
	public void givenString_WhenProper_RetutnFirstMax() {
		MaxInteger maxTest = new MaxInteger();
		boolean StringResult = maxTest.MaxStringLengthPosition("Ahemmed", "Lucky", "Food");
		Assert.assertEquals(true, StringResult);
	}
	// test case 3.2
	@Test
	public void givenString_WhenProper_RetutnSecondMax() {
		MaxInteger maxTest = new MaxInteger();
		boolean StringResult = maxTest.MaxStringLengthPosition("sky", "Colour", "Blue");
		Assert.assertEquals(true, StringResult);
	}
	// test case 3.3
	@Test
	public void givenString_WhenProper_RetutnThirdMax() {
		MaxInteger maxTest = new MaxInteger();
		boolean StringResult = maxTest.MaxStringLengthPosition("Lion", "King", "of Forest");
		Assert.assertEquals(true, StringResult);
	}

}
