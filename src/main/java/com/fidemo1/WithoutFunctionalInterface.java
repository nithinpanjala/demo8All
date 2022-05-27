package com.fidemo1;

public class WithoutFunctionalInterface {

	public static void main(String[] args) {
		MyInterface  myInterface = new MyInterfaceImpl();
		myInterface.defaultMethod1();
		myInterface.defaultMethod2();
		MyInterface.staticFunction1();
		MyInterface.staticFunction2();
	}
}
