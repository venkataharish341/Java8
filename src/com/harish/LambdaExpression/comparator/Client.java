package com.harish.LambdaExpression.comparator;

import java.util.ArrayList;
import java.util.List;

import com.harish.LambdaExpression.forEach.Employee;

public class Client {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Harish", "htavva@gmail.com", 88200));
		empList.add(new Employee("Yaswanth", "yassu@gmail.com", 40000));
		empList.add(new Employee("Akhil", "akhil@gmail.com", 20000));

		//Collections.sort(empList, (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));

		// Comparator is a Functional Interface, so we can implement its abstract method
		// using lambda expression. 
		empList.sort((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));

		// forEach accepts Consumer as arguement and Consumer is a functional interface.
		// So we can write lambda expression.
		empList.forEach((c) -> System.out.println(c));

	}
}
