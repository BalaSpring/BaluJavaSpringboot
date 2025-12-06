package com.balu.java8;

import java.util.stream.IntStream;

public class CheckPolindromeOrNot {

	public static void main(String[] args) {
		String input =  "MadaM";
		int length = input.length()/2;
		System.out.println("half length is:" +length);
		Boolean isPolindrome = IntStream.range(0,input.length()/2).allMatch(i->Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(input.charAt(input.length()-i-1)));
		if(isPolindrome) {
			System.out.println("It is Polindrome");
		} else {
			System.out.println("It is Not Polindrome");
		}
	}

}

