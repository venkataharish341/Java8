package com.harish.LambdaExpression;

/**
 * In this class, we have 3 methods of doing the same thing. It also tells that lambda expressions are nothing but the implementation class for 
 * Functional Interface by implementing the one abstract method in it.
 * 
 * 1). First method is normal way of doing things.
 * 2). Second method is doing the same thing using Anonymous Inner class.
 * 3). Third method is using lambda expression to achieve the same. It can do that because Runnable interface is a Functional interface which will only have
 * 	   one abstract method. So we wrote the lambda expression that achieved the same.
 * Note: Writing lambda expression is just writing the method implementation for the abstract method. We have to make call to that method after defining the 
 *       implementation.
 * 
 */

// Where do you use Lambda Expressions?
// Simple Answer is where ever Functional Interfaces are passed as arguments, we can create a lambda expression because after all lamda expression is the 
// implementation class for that functional interface.

public class LambdaExpression {
	
	private static void createThreadNormally() {
		
		Thread th = new Thread(new LambdaExpression().new myClass());
		th.start();
		
	}

	private static void createThreadUsingAnonymousInnerClass() {
		
		// This is anonymous inner class. It is basically the implementation class for Runnable interface which does not have name (anonymous) and also it
		// does not have a seperate class (Inner class).
		Runnable rn = new Runnable() {
			@Override
			public void run() {
				System.out.println("My Anonymous Inner Class thread is executed.");
			}
		};

		Thread th = new Thread(rn);
		th.start();
	}

	/**
	 * Lambda expressions are like writing implementation class for Functional Interface. 
	 */
	private static void createThreadUsingLambdaExpressions() {
		Runnable r = () -> {System.out.println("Lambda Expression thread is executed.");};
		Thread t = new Thread(r);
		t.start();
	}

	public static void main(String[] args) {

		createThreadNormally();
		createThreadUsingAnonymousInnerClass();
		createThreadUsingLambdaExpressions();
		
	}
	
	// Class implements runnable interface, so we can create thread from its instance.
	class myClass implements Runnable {

		@Override
		public void run() {
			System.out.println("My Normal Thread is executed.");
		}
		
	}
}
