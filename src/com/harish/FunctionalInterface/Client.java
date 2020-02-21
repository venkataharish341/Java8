package com.harish.FunctionalInterface;

public class Client {

	public static void main(String[] args) {
		
		// This line is just writing implementation class for the Functional Interface
		// MyInterface.
		MyInterface mi = (n1, n2)-> n1>n2;
		
		// This line invokes the method on that by sending the real arguements.
		System.out.println(mi.compareIntegers(40, 30));
	}
}
