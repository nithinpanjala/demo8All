package com.fidemo4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ten", 1010.10f));
		employees.add(new Employee(20, "Twenty", 2020.20f));
		employees.add(new Employee(30, "Thirty", 3030.30f));
		
		EmployeeInterface employeeInterface = (List<Employee> arg1, int arg2) ->{
			Employee tempEmployee  = null; 
			for (Employee employee : employees) {
				if(employee.getEmpNo() == arg2)
				{
					tempEmployee = employee;
				}
				else
				{
					// failure
				}
			}
			return tempEmployee;//null
		};

		 Employee ouput= employeeInterface.searchEmployeeById(employees,40);
		 if(ouput != null) {
		 System.out.println(ouput.getEmpNo());
		 System.out.println(ouput.getEmpName());
		 }
		 else {
			System.out.println("No such employee");
		}
	}

}
