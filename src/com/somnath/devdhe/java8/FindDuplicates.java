package com.somnath.devdhe.java8;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Somnath","Shubham","Shivam","Rahul","Somnath");
		Integer a[]={4, 2, 4, 5, 7, 2, 5, 4, 2};
		List<Integer> intList =Arrays.asList(a);
		
		
		Optional<Integer> third = intList.stream().distinct().sorted(Collections.reverseOrder()).skip(2).findFirst();
		
		 System.out.println(third);
		//Using HashSet 
			Set<Integer> uniqueNames = new HashSet<>();
		    
		    Set<Integer> newList = intList.stream().filter(names -> !uniqueNames.add(names)).collect(Collectors.toSet());
		    System.out.println(newList);
		//Set<String> newList = list.stream().filter(names -> !uniqueNames.add(names)).collect(Collectors.toSet());
		  
		  // Using Map
		 Map<String, Long> map = list.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println(map);
		 
		Set<String> newSet = map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
		 //System.out.println(newSet);
		
		//3
		 Set<String> set = list.stream().filter(name -> Collections.frequency(list, name) > 1).collect(Collectors.toSet());
		 System.out.println(set);
	}

}
