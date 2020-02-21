package com.harish.defaultAndstatic;

import java.util.Collections;
import java.util.List;

public interface MyInterface2 {

	default public List<Student> sortStudents(List<Student> studentsList) {

		Collections.sort(studentsList);
		return studentsList; 
	}

}
