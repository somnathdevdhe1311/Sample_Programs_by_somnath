package com.somnath.devdhe.java8.pojo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Somnath", 7000);
		map.put("Rahul", 9000);
		map.put("Ajay", 3000);
		map.put("Nilesh", 1000);
		map.put("Harsh", 11000);
		
		
	Map<Object, Object> sortedMap = map.entrySet().stream().sorted((a1,a2)->a1.getValue().compareTo(a2.getValue())).collect(Collectors.toMap(Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1, LinkedHashMap::new));

	
	System.out.println(sortedMap);
//	 sortedMap.forEach((key, value) ->{
//		 
//		 System.out.println("key:"+key +"   value:"+value);
//		 
//	 });
	}

}
