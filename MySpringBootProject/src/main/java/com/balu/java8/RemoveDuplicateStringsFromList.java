package com.balu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStringsFromList {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Java","Balu", "Spring" ,"Test", "java", "Balu");
		
		List<String> uniqueList = stringList.stream().map(String::toLowerCase).distinct().collect(Collectors.toList());
		
		System.out.println("Unique List is:"+uniqueList);

	}

}
