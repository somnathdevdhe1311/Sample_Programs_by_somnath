package com.somnath.devdhe.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummeryStatastics {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(7);
		list.add(9);list.add(13);list.add(26);list.add(35);
		list.add(56);
		
		double number = list.stream().mapToInt(num -> num).summaryStatistics().getMin();

		long sum = list.stream().filter(x->x%2==0).mapToInt(a -> a).summaryStatistics().getSum();

		List<String> stringList = Arrays.asList("Sujay","Shubham","Shivam","Rahul","Somnath");
		
		List<String> list1 = stringList.stream().filter(str -> str.contains("S")).collect(Collectors.toList());
		
		System.out.println(sum);
	}
	

}
