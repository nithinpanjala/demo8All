package com.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "Ten", 1010.10f));
		employees.add(new Employee(200, "Twenty", 2020.20f));
		employees.add(new Employee(300, "Thirty", 3030.30f));

		employees.forEach((var) -> {
			System.out.println(var.getEmpNo());
			System.out.println(var.getEmpName());
			System.out.println(var.getSalary());
		});

		employees.forEach(System.out::println);
	}

}
