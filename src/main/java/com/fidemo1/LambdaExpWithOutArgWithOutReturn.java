package com.fidemo1;

public class LambdaExpWithOutArgWithOutReturn {

	public static void main(String[] args) {
	// FI  = ->
	 MyInterface myInterface	= ( ) -> {
		 									System.out.println("Welcome to Lambda");
		 									 System.out.println("second to Lambda");
	 };
	 									
	 myInterface.fun();
	}

}
