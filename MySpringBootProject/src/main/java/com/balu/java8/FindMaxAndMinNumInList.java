package com.balu.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumInList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int max = numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max value is:"+max);
		
		int min = numbers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Max value is:"+min);

	}

}
