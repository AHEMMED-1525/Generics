package com.bridgelabz.generics;

public class PrintArray {
		public static <A> void toPrint(A[] intarray) {
			for(A generic: intarray) {
				System.out.println(generic);
			}
			System.out.println();
		}

		public static void main(String[] args)
		{
			Integer[] intArr = {1, 2, 3, 4};
			Double[] doubleArr = {18.0, 15.0, 850.5, 10.2};
			Character[] charArr = {'H', 'E', 'L', 'O'};
			PrintArray.toPrint(intArr);
			PrintArray.toPrint(doubleArr);
			PrintArray.toPrint(charArr);
		}

}
