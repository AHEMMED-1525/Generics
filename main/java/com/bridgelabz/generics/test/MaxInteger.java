package com.bridgelabz.generics.test;

public class MaxInteger<E extends Comparable<E>> {

	public static <E extends Comparable<E>> E CheckMaximumValue (E... elements) {
		E maximum = elements[0];
		for(E element : elements)
		if(element.compareTo(maximum) > 0 ) {
			maximum = element;
		}

		return maximum ;
	}
	
	
	
}
