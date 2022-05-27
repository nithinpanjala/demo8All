package com.methodreference;

public class MainDemo {
	// Reference to an instance method.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		MyInterface myInterface = myClass::sayHello;
		String str = myInterface.sayHello("STG");
		System.out.println(str);

	}

}
