package com.fidemo2;

public class FIMain {

	public static void main(String[] args) {
	   MyInterfaceWithParam interfaceWithParam  =   (int abc ) ->{
		   System.out.println("lambda with parameter : " + abc);
		   System.out.println("lambda with parameter : " + (abc + 100));
	   };
	   interfaceWithParam.display(22);
	}

}
