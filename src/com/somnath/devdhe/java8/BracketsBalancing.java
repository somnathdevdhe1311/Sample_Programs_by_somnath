package com.somnath.devdhe.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BracketsBalancing {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>(List.of("somnath","suraj","harshawardhan","rahul","sagar",""));
		
		
		List<Integer> list2 = Arrays.asList(1,4,6,7,9,2,3,1,2,6,9);
		List<String> newList= list.stream().filter(n -> n.startsWith("s")).collect(Collectors.toList());
		
		List<String> filtered = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		Long count = list.stream().count();
	
		List<Integer> intList =list2.stream().map(n -> n.valueOf(n)).collect(Collectors.toList());
	
		long count1 = list.parallelStream().filter(string -> string.isEmpty()).count();
		
		List<Integer> intList1 = list2.stream().map(n -> n).distinct().collect(Collectors.toList());
		
		List<Integer> distinctList = list2.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctList);
		
		String str = null;
		
		Optional<String> n = Optional.ofNullable(str);
		
		System.out.println(n);
		
		List<Integer> intList2 =list2.stream().sorted((n1,n2) -> n2.compareTo(n1)).collect(Collectors.toList());
	 
		 List<Integer> asc = list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(asc);
		
		List<Integer> intList3 =list2.stream().sorted().collect(Collectors.toList());
		
		System.out.println(intList3);
		
		
	}

}
