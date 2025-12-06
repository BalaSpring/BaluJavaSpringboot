package com.balu.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInRevereseOrder {

	public static void main(String[] args) {
		List<Double> decimals = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimals = decimals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(decimals);
	}

}
