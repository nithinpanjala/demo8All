package com.streams1;
//POJO
public class Employee extends Object{
	private int empNo;
	private String empName;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, float salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	

}
