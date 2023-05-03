package com.somnath.devdhe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;

public class solution1{

	public static void main(String[] args) {
		
	
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		list.add("Somnath");
		list.add("Rakesh");
		list.add("Ajay");
		list.add("Abhishek");
		list.add("Pawan");
		
		intList.add(12);
		intList.add(122);
		intList.add(1262);
		intList.add(1);
		
		Integer max  = intList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		Integer min  =intList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		 list.stream().sorted((o1,o2)->o1.compareTo(o2));
		
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return  Character.compare(o1.charAt(1), o2.charAt(1));
//			}
//		});
		 System.out.println(min+""+max);

	}

}
