package com.harish.LambdaExpression.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class forEachMethodForIteratingMap {

	public static void main(String[] args) {

		
		Map<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(1024, new Employee("Harish", "htavva@gmail.com", 88200));
		hm.put(1025, new Employee("Yaswanth", "yassu@gmail.com", 40000));
		hm.put(1026, new Employee("Akhil", "akhil@gmail.com", 20000));
		
		// Iterating HashMap using entry set.
		for(Entry<Integer, Employee> entry: hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		// Iterating HashMap using keys
		for(Integer key: hm.keySet()) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
	
		// Iterate using forEach method. Argument for forEach here is BiConsumer which is
		// a functional interface. So we have implemented it using lambda expression.
		hm.forEach((k,v) -> {System.out.println(k +"\t" + v);});
		
	}

}
