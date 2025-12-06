package com.balu.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String input = "This is Java";
		String output = Arrays.stream(input.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println("Output is :"+output);

	}

}
