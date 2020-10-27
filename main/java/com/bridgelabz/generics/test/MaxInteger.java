package com.bridgelabz.generics.test;

public class MaxInteger<E extends Comparable<E>> {

	// Creating one Generic Method for all data types
	public static <E extends Comparable<E>> E CheckMaximumValue (E varX, E varY, E varZ) {
		E maximum = varX;
		if((varY).compareTo(maximum) > 0 ) {
			maximum = varY;
		}
		if(varZ.compareTo(maximum) > 0 ) {
			maximum = varZ;
		}
		return maximum ;
	}
	
	
	
}
