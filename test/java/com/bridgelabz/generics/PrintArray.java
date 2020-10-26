package com.bridgelabz.generics;

public class PrintArray {
	
	public static void toPrint(int[] a) {
		for(int i : a) {
			System.out.print(i+ "\t");
		}
		System.out.println("\n");
	}
	public static void toPrint(double[] b) {
		for(double i : b) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}
	public static void toPrint(char[] c) {
		for(char i : c) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4};
		double[] doubleArr = {18.0,15.0,850.5,10.2};
		char[] charArr = {'a','h','a','n'};
		toPrint(intArr);
		toPrint(doubleArr);
		toPrint(charArr);
		
	}

}
