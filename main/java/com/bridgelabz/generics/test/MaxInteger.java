package com.bridgelabz.generics.test;

public class MaxInteger<E extends Comparable<E>> {
	E varX , varY, varZ;

	public MaxInteger(E varX, E varY, E varZ) {
	
		this.varX = varX;
		this.varY = varY;
		this.varZ = varZ;
	}
	public E CheckMaximumValue()
	{
		return (E) MaxInteger.CheckMaximumValue(varX, varY, varZ);
	}
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
