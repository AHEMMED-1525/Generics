package com.bridgelabz.generics.test;

public class MaxInteger {
	// First position maximum
	public boolean MaxAtFirstPosition(Integer x, Integer y, Integer z) {
		if(x.compareTo(y) > 0 && x.compareTo(z) > 0) 
		{
			System.out.println("First Maximum Integer is : " +x);
			return true;
		}
		else
			return false;
		}
	// Second Position maximun
	public boolean MaxAtSecondPosition(Integer x, Integer y, Integer z) {
		if(y.compareTo(x) > 0 && y.compareTo(z) > 0) {
			System.out.println("Second Maximum Integer is : " +y);
			return true;
		}
		else
			return false;
	}
	// Third Position Maximum
	public boolean MaxAtThirdPosition(Integer x, Integer y, Integer z) {
		if(z.compareTo(x) > 0 && z.compareTo(y) > 0) {
			System.out.println("Third Maximum Integer is :" +z );
			return true;
		}
		else
			return false;
	}
	
	
	
}
