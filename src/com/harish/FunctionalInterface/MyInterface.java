package com.harish.FunctionalInterface;

// Here even if we do not specify it with @FunctionalInterface, it is considered as
// Functional Interface, because it has only one abstract method other than the ones
// overrided from Object class.

@FunctionalInterface
public interface MyInterface {

	public abstract boolean compareIntegers(int a, int b);

	// Below 2 abstract methods are from Object class, so not counted.
	public int hashCode();

	public boolean equals(Object obj);


	// We can have any no. of default and static methods in the Functional Interface
	// and those are not counted to make this interface, a Functional Interface.


}
