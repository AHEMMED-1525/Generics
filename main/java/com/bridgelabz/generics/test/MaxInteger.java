package com.bridgelabz.generics.test;

public class MaxInteger {
	public boolean MaxAtFirstPosition(Integer x, Integer y, Integer z) {
		if(x.compareTo(y) > 0 && x.compareTo(z) > 0)  	               // If true return First position maximum
		{
			System.out.println("First Maximum Integer is : " +x);
			return true;
		}
		else if(y.compareTo(x) > 0 && y.compareTo(z) > 0)	           //if true return Second Position maximum 
		{
			System.out.println("Second Maximum Integer is : " +y);
			return true;
		} 
		else if(z.compareTo(x) > 0 && z.compareTo(y) > 0)          	  // if true returns Third Position Maximum
		{
			System.out.println("Third Maximum Integer is :" +z );
			return true;
		}
		else
			return false;
	}
	public boolean maxFloatValuePosition(Float var1, Float var2 , Float var3) {
		if(var1.compareTo(var2) > 0 && var1.compareTo(var3) > 0)             // If true return First position maximum
		{
			System.out.println("Maximum First Float value is : " +var1);
			return true;
		}
		else if(var2.compareTo(var1) > 0 && var2.compareTo(var3) > 0) 		//if true return Second Position maximum 
		{
			System.out.println("maximum Second Float is : " +var2);
			return true;
		}
		else if(var3.compareTo(var1) > 0 && var3.compareTo(var2) > 0) 		 // if true returns Third Position Maximum
		{
			System.out.println("Maximum Third Float value is : " +var3);
			return true;
		}
		return false;
	}
	public boolean MaxStringLengthPosition(String str1, String str2, String str3) {
		if(str1.length() > str2.length() && str1.length() > str2.length()) {
			System.out.println("First Maximum Length of the String is : " + str1);
			return true;
		}
		if(str2.length() > str1.length() && str2.length() > str3.length()) {
			System.out.println("Second Maximum Length of the String is : " + str2);
			return true;
		}
		if(str3.length() > str1.length() && str3.length() > str2.length()) {
			System.out.println("Third Maximum Length of the String is : " + str3);
			return true;
		}
		return false;
	}
	
	
	
}
