package com.refenceconstructor;

public class ReferenceConstructorMain {

	public static void main(String[] args) {
		MyInterface myInterface = Employee::new;
		Employee obj = myInterface.sayHello(22, "Apple", 25.56f);
		System.out.println(obj.getEmpNo());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getSalary());
		

	}

}
