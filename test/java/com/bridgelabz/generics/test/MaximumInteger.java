package com.bridgelabz.generics.test;

import org.junit.Assert;
import org.junit.Test;


public class MaximumInteger {
	// Test case 1.1
	@Test
	public void givenInteger_WhenProper_ReturnsFirstMaximum() {
		MaxInteger maxTest = new MaxInteger(90, 40, 50);
		int result1 = (Integer) maxTest.CheckMaximumValue();
		Assert.assertEquals(90,result1);
	}
	// Test case 1.2
	@Test
	public void givenInteger_WhenProper_ReturnsSecondInteger() {
		MaxInteger maxTest = new MaxInteger(60, 80, 50);
		int result2 = (Integer) maxTest.CheckMaximumValue();
		Assert.assertEquals(80, result2);
	}
	// Test case 1.3
	@Test
	public void givenInteger_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger(25, 50, 100);
		int result3 = (Integer) maxTest.CheckMaximumValue();
		Assert.assertEquals(100, result3);	
	}
	// test case 2.1
	@Test
	public void givenFloatValue_WhenProper_ReturnFirstMaximum() {
		MaxInteger maxTest = new MaxInteger(15.214f, 8.541f, 10.54f);
		float FloatResult = (Float) maxTest.CheckMaximumValue();
		Assert.assertEquals(15.214, FloatResult,15.214f);
	}
	// Test case 2.2
	@Test
	public void givenFloatValue_WhenProper_ReturnSecondMaximum() {
		MaxInteger maxTest = new MaxInteger(15.214f, 18.541f, 10.54f);
		float FloatResult = (Float) maxTest.CheckMaximumValue();
		Assert.assertEquals(18.514f, FloatResult,18.54f);
	}
	// Test case 2.3
	@Test
	public void givenFloatValue_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger(15.214f, 18.541f, 20.54f);
		float FloatResult = (Float) maxTest.CheckMaximumValue();
		Assert.assertEquals(20.54f, FloatResult,20.54f);
	}
	// test case 3.1
	@Test
	public void givenString_WhenProper_RetutnFirstMax() {
		MaxInteger maxTest = new MaxInteger("on", "Lucky", "Food");
		String StringResult = (String) maxTest.CheckMaximumValue();
		Assert.assertEquals("on", StringResult);
	}
	// test case 3.2
	@Test
	public void givenString_WhenProper_RetutnSecondMax() {
		MaxInteger maxTest = new MaxInteger("Colour", "sky", "Blue");
		String StringResult = (String) maxTest.CheckMaximumValue();
		Assert.assertEquals("sky", StringResult);
	}
	// test case 3.3
	@Test
	public void givenString_WhenProper_RetutnThirdMax() {
		MaxInteger maxTest = new MaxInteger("Forest", "Kings", "Lion");
		String StringResult = (String) maxTest.CheckMaximumValue();
		Assert.assertEquals("Lion", StringResult);
	}

}
