package com.bridgelabz.generics.test;

import org.junit.Assert;
import org.junit.Test;

public class MaximumInteger {
	// Test case 1.1
	@Test
	public void givenInteger_WhenProper_ReturnsFirstMaximum() {
		MaxInteger maxTest = new MaxInteger();
		int result1 = (Integer) maxTest.CheckMaximumValue(90, 40, 30,80,60);
		Assert.assertEquals(90,result1);
	}
	// Test case 1.2
	@Test
	public void givenInteger_WhenProper_ReturnsSecondInteger() {
		MaxInteger maxTest = new MaxInteger();
		int result2 = (Integer) maxTest.CheckMaximumValue(60, 80,10,25, 70);
		Assert.assertEquals(80, result2);
	}
	// Test case 1.3
	@Test
	public void givenInteger_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger();
		int result3 = (Integer) maxTest.CheckMaximumValue(25, 50, 100,200,95);
		Assert.assertEquals(200, result3);	
	}
	// test case 2.1
	@Test
	public void givenFloatValue_WhenProper_ReturnFirstMaximum() {
		MaxInteger maxTest = new MaxInteger();
		float FloatResult = (Float) maxTest.CheckMaximumValue(15.214f, 8.541f, 10.54f,1.5f,25.18f,98.54f);
		Assert.assertEquals(98.54f, FloatResult,0.f);
	}
	// Test case 2.2
	@Test
	public void givenFloatValue_WhenProper_ReturnSecondMaximum() {
		MaxInteger maxTest = new MaxInteger();
		float FloatResult = (Float) maxTest.CheckMaximumValue(15.214f, 18.541f, 10.54f,58.125f,72.15f);
		Assert.assertEquals(72.15f, FloatResult,18.54f);
	}
	// Test case 2.3
	@Test
	public void givenFloatValue_WhenProper_ReturnThirdMaximum() {
		MaxInteger maxTest = new MaxInteger();
		float FloatResult = (Float) maxTest.CheckMaximumValue(15.214f, 18.541f, 20.54f);
		Assert.assertEquals(20.54f, FloatResult,20.54f);
	}
	// test case 3.1
	@Test
	public void givenString_WhenProper_RetutnFirstMax() {
		MaxInteger maxTest = new MaxInteger();
		String StringResult = (String) maxTest.CheckMaximumValue("on", "Lucky", "Food","StoryTeller","Ahemmed");
		Assert.assertEquals("on", StringResult);
	}
	// test case 3.2
	@Test
	public void givenString_WhenProper_RetutnSecondMax() {
		MaxInteger maxTest = new MaxInteger();
		String StringResult = (String) maxTest.CheckMaximumValue("Colour", "sky", "Blue");
		Assert.assertEquals("sky", StringResult);
	}
	// test case 3.3
	@Test
	public void givenString_WhenProper_RetutnThirdMax() {
		MaxInteger maxTest = new MaxInteger();
		String StringResult = (String) maxTest.CheckMaximumValue("Forest", "Kings", "Lion");
		Assert.assertEquals("Lion", StringResult);
	}
}
