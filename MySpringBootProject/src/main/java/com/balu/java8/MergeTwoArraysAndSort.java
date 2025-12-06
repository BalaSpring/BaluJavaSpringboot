package com.balu.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndSort {

	public static void main(String[] args) {
		int[] a = {1,5,9,15};
		int[]  b = {2,8,12,16};
		
		int[] mergeList = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println("Merge List is: "+Arrays.toString(mergeList));
	}

}
