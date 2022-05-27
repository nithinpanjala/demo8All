package com.deprecated;

public class MyClass {

	@Deprecated
	int var;
	int anotherVar;

	@Deprecated
	public void hello() {
		System.out.println("Welcome to hello()");
	}

	public String hello(int a) {
		return "Welcome :" + a;
	}
}
