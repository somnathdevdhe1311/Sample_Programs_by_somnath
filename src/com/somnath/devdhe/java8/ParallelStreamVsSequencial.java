package com.somnath.devdhe.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParallelStreamVsSequencial {

	public static void main(String[] args) {
	
		Integer array[] = {8,25, 78, 55, 1, 4, 7 ,9, 3};
		
		List list = Arrays.asList(array);
		
		//list.stream().forEach(System.out::println);
		
		list.parallelStream().forEachOrdered(System.out::println);
		
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		 map.put("Harsh",101);
		 map.put("Vinay",131);
		 map.put("Harsh",141);
		 
		System.out.println("size is:"+map.size()); 

	}

}
