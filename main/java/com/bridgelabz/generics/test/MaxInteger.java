package com.bridgelabz.generics.test;

public class MaxInteger {
	public int MaximumIntegerPosition(Integer x, Integer y, Integer z) {
		Integer maxIntValue = x;
		if(y.compareTo(maxIntValue) > 0)  	             
		{
			maxIntValue = y;
		}
		if(z.compareTo(maxIntValue) > 0)  	               
		{
			maxIntValue = z;
		}
		
			return maxIntValue;
	}
	public float maxFloatPosition(Float var1, Float var2 , Float var3) {
		float maxFloatValue = var1;
		if(var2.compareTo(maxFloatValue) > 0) 		
		{
			maxFloatValue = var2;
		}
		if(var3.compareTo(maxFloatValue) > 0) 		 
		{
			maxFloatValue = var3;
		}
		return maxFloatValue;
	}
	public String MaxStringLengthPosition(String str1, String str2, String str3) {
		String maxString = str1;
		if(str2.compareTo(maxString) > 0) {
			maxString = str2;
		}
		if(str3.compareTo(maxString) > 0) {
			maxString = str3;
		}
		return maxString;
	}
	
	
	
}
