package com.harish.LambdaExpression.forEach;

public class Employee {
	
	private String empName;
	private String emailId;
	private double salary;
	
	public Employee(String empName, String emailId, double salary) {
		super();
		this.empName = empName;
		this.emailId = emailId;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", emailId=" + emailId + ", salary=" + salary + "]";
	}
	
}
