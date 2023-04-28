package com.somnath.devdhe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestSort3{  
	public static void main(String args[]){  
	ArrayList<ComparableDemo> al=new ArrayList<ComparableDemo>();  
	al.add(new ComparableDemo(101,"Vijay",23));  
	al.add(new ComparableDemo(106,"Ajay",27));  
	al.add(new ComparableDemo(105,"Jai",21));  
	  
	List<ComparableDemo> list = al.stream().sorted(Comparator.comparing(ComparableDemo::getAge,Comparator.reverseOrder())).collect(Collectors.toList());
	
	System.out.println(list);
	
	}  
	
}