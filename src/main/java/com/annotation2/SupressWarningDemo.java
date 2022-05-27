package com.annotation2;

import java.util.ArrayList;
import java.util.List;

public class SupressWarningDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		@SuppressWarnings("rawtypes")
		List list = new ArrayList(); // type safty == avoid class cast exception
		list.add("Hello");
	}

}
