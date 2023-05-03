package com.somnath.devdhe.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamIntegerOperations {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(15);
		numbers.add(2);
		numbers.add(64);
		numbers.add(665);
		numbers.add(25);
		numbers.add(885); 
		numbers.add(5555);
		
		//size of list
		 long sizeOfList = numbers.stream().count();
		// System.out.println(sizeOfList);
		 
		 // get minimum number using summaryStatistics
		 int minimunNumber = numbers.stream().mapToInt(x->x).summaryStatistics().getMin();
		 //System.out.println(minimunNumber);
		 
		// get maximum number using comparator
		 int maximumNumber =  numbers.stream().max((a,b)->a.compareTo(b)).get();
		 //System.out.println(maximumNumber);
		 
		 //addition of all numbers
		 long sumOfAllNumbers = numbers.stream().mapToInt(a->a).sum();
		 //System.out.println(sumOfAllNumbers);
		 
		 //addition of all even numbers
		 long sumOfEvenNumbers = numbers.stream().filter(x->x%2==0).mapToInt(a->a).sum();
		 //System.out.println(sumOfEvenNumbers);
		 
		 //addition of all odd numbers
		 long sumOfOddNumbers = numbers.stream().filter(x->x%2!=0).mapToInt(a->a).sum();
		 //System.out.println(sumOfOddNumbers);
		 
		//sort numbers in ASC order
		List<Integer> ascSortredList = numbers.stream().sorted().collect(Collectors.toList());
		//System.out.println(ascSortredList);
		
		//sort numbers in DESC order
		List<Integer> descSortredList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(descSortredList);
		
		//5th lowest from array
		Optional<Integer> fifthLowest = numbers.stream().sorted().skip(4).findFirst();
		System.out.println(fifthLowest);
		
		
		 
	}
}
