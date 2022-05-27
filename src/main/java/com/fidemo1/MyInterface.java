package com.fidemo1;

@FunctionalInterface
public interface MyInterface {
//SAM Single abstract method 
	public abstract void fun();

	public default void defaultMethod1() {
		System.out.println("Inside default method One");
	}

	public default void defaultMethod2() {
		System.out.println("Inside default method Two");
	}

	static void staticFunction1() {
		System.out.println("Static method ()  One");
	}

	static void staticFunction2() {
		System.out.println("Static method () two");
	}
}
