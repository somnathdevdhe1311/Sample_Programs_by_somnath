package com.somnath.devdhe.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepatatingCharacters {

	public static void main(String[] args) {

		String str = "missisippi";

		
		int i = 0;
		HashMap<Character, Integer> map = new HashMap<>();

		for (i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {

				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);

			} else {
				map.put(str.charAt(i), 1);
			}

		}
		System.out.println(map);
		 

//		char[] ch = str.toCharArray();
//		List<char[]> list = Arrays.asList(ch);
//
//		Map<char[], Long> map1 = list.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		map1.entrySet().forEach(entry -> {
//
//			System.out.println(entry.getKey() + "--" + entry.getValue());
//		});

//		HashMap<Character, Integer> map = new HashMap<>();
//		int count = 1, i, j;
//		for (i = 0; i < str.length(); i++) {
//
//			for (j = 1; j < str.length(); j++) {
//
//				char c = str.charAt(i);
//
//				if (c == str.charAt(j)) {
//
//					count++;
//				}
//
//			}
//			map.put(str.charAt(i), count);
//
//			count = 0;
//
//		}
//		System.out.println(map);
   }

}
