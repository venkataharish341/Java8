package com.harish.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

	public static void main(String[] args) {

		//Intermediate Operations
		//--------------------------

		//1) Map
		List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
		list.stream().map(number -> number * 3).forEach(System.out::println);

		//2) Filter
		List<String> names = Arrays.asList("Ray", "Reflection","Collection","Stream", "Rochester");
		names.stream().filter(s -> s.startsWith("R")).forEach(System.out::println);

		//3) Sorted
		List<String> words = Arrays.asList("Reflection","Collection","Stream");
		words.stream().sorted().forEach(System.out::println);

		// Terminal Operations
		//-----------------------

		//1) collect
		List<Integer> collection = Arrays.asList(3, 6, 9, 12, 15);
		List<Integer> collected = collection.stream().map(x -> x*x).collect(Collectors.toList());
		collected.stream().forEach(x -> System.out.println(x));

		//2) forEach

		//3) Reduce
		int even = list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);

		//4) Count
		long totalMatched = names.stream()
				.filter((s) -> s.startsWith("R"))
				.count();

		System.out.println(totalMatched);

		//5) Match
		boolean matchedResult = names.stream()
				.anyMatch((s) -> s.startsWith("R"));

		System.out.println(matchedResult);

		matchedResult = names.stream()
				.allMatch((s) -> s.startsWith("R"));

		System.out.println(matchedResult);

		matchedResult = names.stream()
				.noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		//6) findFirst()
		String firstMatchedName = names.stream()
				.filter((s) -> s.startsWith("R"))
				.findFirst().get();

		System.out.println(firstMatchedName);

		//Converting Streams to other data structures
		//-------------------------------------------------

		// We can also change streams to ArrayList, HashMap, Sets etc. Goto Collectors class for more info. 	
		// 1) To Arrays 

		List<Integer> converts = new ArrayList<Integer>();
		for(int i = 1; i< 10; i++){
			converts.add(i);
		}
		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);

		System.out.println(evenNumbersArr);

	}

}
