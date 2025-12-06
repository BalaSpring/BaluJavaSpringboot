package com.balu.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionOddOrEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Map<Boolean, List<Integer>> partitionedNumbers= numbers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		if(partitionedNumbers.containsKey(true)) {
			
			System.out.println("Even Numbers are:"+partitionedNumbers.get(true));
			
		} 
		if(partitionedNumbers.containsKey(false)) {
			
			System.out.println("Odd Numbers are:"+partitionedNumbers.get(false));
			
		} 

	}

}
