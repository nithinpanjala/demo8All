package com.fidemo3;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		InterWithParmAndReturn withParmAndReturn = (int a, float b) -> {
			System.out.println("Integer val : " + a);
			System.out.println("Float val   : " + b);
			return "return data" + "Integer val : " + a + "Float val   : " + b;
		};

		BiFunction<Integer, Float, String>  biFunction =(a, b) -> {
			System.out.println("Integer val : " + a);
			System.out.println("Float val   : " + b);
			return "return data" + "Integer val : " + a + "Float val   : " + b;
		};
		String ans = withParmAndReturn.getdetial(21, 5000);
		System.out.println(ans);
		System.out.println("Predeined Functional interface ");
		String var = biFunction.apply(33, 4455.66f);
		System.out.println(var);
		
	}

}
