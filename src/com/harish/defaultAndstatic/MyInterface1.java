package com.harish.defaultAndstatic;

import java.util.Collections;
import java.util.List;

public interface MyInterface1 {
	
	/**
	 * In Java8, if we add "default" keyword, we can provide implementation in the method.
	 * Note 1: Can be overridden in implementation class, but developers are not forced to implement these methods in implementation classes unlike abstract methods.
	 * Note 2: Cannot override a method (like hashcode, equals etc.) from Object class as every class is child of Object
	 * and implementation class for this interface is also child of Object class. Then if you override a method from that class here, 
	 * your child class will be confused (like multiple inheritance) and gives a compile time error.
	 * 
	 * @param studentsList
	 * @return
	 */
	default public List<Student> sortStudents(List<Student> studentsList) {
		
		Collections.sort(studentsList);
		return studentsList; 
	}
	
	/**
	 * In Java 8, if we add "static" keyword, we can provide implementation.
	 * Note: Cannot be overridden in implementation class because it is static and it belongs to this interface.
	 * But we can have a method in the child class with same method name.
	 */
	public static void greet() {
		System.out.println("Hello world");
	}
 
	/**
	 * Normal Abstract method from Java 7
	 * @return
	 */
	public abstract String getDate();
	
}
