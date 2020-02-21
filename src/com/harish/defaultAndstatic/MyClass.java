package com.harish.defaultAndstatic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// All classes in Java extends from Object or Object is Super class in Java.
public class MyClass extends Object implements MyInterface1, MyInterface2 {

	@Override
	public String getDate() {
		return new Date().toString();
	}

	// You can override a default method from MyInterface in its implementation class.
	// Since this class implements MyInterface1 and MyInterface2 and both of them have the same default method (signatures are same), 
	// in this case, the implementation should override that default method. 
	@Override
	public List<Student> sortStudents(List<Student> studentsList) {
		//Use super keyword to access the sortStudents method in its parent Interface if its default method.
		return MyInterface2.super.sortStudents(studentsList);
	}

	// You should not have @Override here, since it is static in MyInterface, it will not allow.
	public static void greet() {
		System.out.println("Hello Harish.");
	}


	public static void main(String[] args) {
		
		MyInterface1 mi = new MyClass();

		System.out.println(mi.getDate());


		Student s1 = new Student("Harish", 28);
		Student s2 = new Student("Yaswanth", 28);
		Student s3 = new Student("Akhil", 28);

		List<Student> sList = new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);

		sList = mi.sortStudents(sList);
		sList.stream().forEach((c) -> System.out.println(c.getName()));

		MyInterface1.greet();

	}
}
