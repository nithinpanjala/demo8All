package com.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.foreach.Employee;

public class StreamWithForEach {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "Apple", 1010.10f));
		employees.add(new Employee(200, "Mango", 2020.20f));
		employees.add(new Employee(300, "Orange", 3030.30f));

		employees.stream().forEach((a) -> { 
			System.out.println(a.getEmpNo());
			System.out.println(a.getEmpName());
			System.out.println(a.getSalary());
		});

		long employeeAbove2000 = employees.stream().filter((a)-> a.getSalary()>2000).count();
		System.out.println("Employees earning more then 2000 : " + employeeAbove2000);
		
		List<Employee> newList = employees.stream().filter((a)-> a.getSalary()>2000).filter((b)->b.getEmpName().contains("an")).collect(Collectors.toList());
		for (Employee employee : newList) {
			System.out.println(employee.getEmpNo());
		}
	}

}
