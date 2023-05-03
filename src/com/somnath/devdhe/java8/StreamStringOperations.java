package com.somnath.devdhe.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("DnyanPrakash");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      names.add("Aadesh");
	      names.add("Ganesh");
	      names.add("Paresh");
	      
	      //print names in ASC order
	      List<String> ascSortedList = names.stream().sorted().collect(Collectors.toList());
	      //ascSortedList.forEach(nms -> System.out.println(nms));
	      
	      //print names in DESC order
	      List<String> descSortedList = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	      //descSortedList.forEach(nms -> System.out.println(nms));
	      
	      //print names which contains 're' with ASC sorting
	      List<String> containsAnything = names.stream().filter(x->x.contains("re")).sorted().collect(Collectors.toList());
	      //containsAnything.forEach(nms -> System.out.println(nms));
	      
	      //print names whose length is >6
	      List<String> lengthgt = names.stream().filter(x->x.length()>6).collect(Collectors.toList());
	      //lengthgt.forEach(nms -> System.out.println(nms));
	      
	      //print name which is 3rd from ASC order list 
	      Optional<String> thirdName = names.stream().sorted().skip(2).findAny();
	      //System.out.println(thirdName);
	      
	      //print names whose length is >6 with uppercase
	      List<String> lengthgtUpperCase = names.stream().filter(x->x.length()>9).collect(Collectors.toList());
	      lengthgtUpperCase.forEach(nms -> System.out.println(nms.toUpperCase()));
	      
	      
	      //count how many names are list
	      
	      
	      
	      

	}

}
