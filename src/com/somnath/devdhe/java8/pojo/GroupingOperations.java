package com.somnath.devdhe.java8.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingOperations {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1,"Somnath","Computer","Active",1000,100));
		empList.add(new Employee(2,"Soham","Mechanical","InActive",2000,101));
		empList.add(new Employee(3,"Suresh","Electrical","Active",3000,102));
		empList.add(new Employee(4,"Shivam","Computer","InActive",4000,103));
		empList.add(new Employee(5,"Sagar","Mechanical","Active",5000,104));
		empList.add(new Employee(6,"Satish","Civil","Active",6000,105));
		
		// department wise emp details
		 // Map<String, List<Employee>> result = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.toList()));
		
		//department wise emp count
		Map<String, Long> result = empList.stream().collect(Collectors.groupingBy(x->x.getDeptName(), Collectors.counting()));
		
		//count by status
		//Map<String, Long> result = empList.stream().collect(Collectors.groupingBy(Employee::getStatus, Collectors.counting()));
		
		
		//List of emp using status
		//List<Employee> result = empList.stream().filter(x -> "InActive".equals(x.getStatus())).collect(Collectors.toList());
		
		//result.forEach(System.out::println);
		
		Optional<Employee> empMax = empList.stream().max(Comparator.comparing(Employee::getSalary));
		
		Optional<Employee> empMin = empList.stream().min(Comparator.comparing(Employee::getSalary));
		
		//System.out.println(empMax);
		
		//System.out.println(empMin);
		
		Optional<Double> heighestSal = empList.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
		
		System.out.println(result);
		
		/*
		 * result.entrySet().forEach(entry->{
		 * 
		 * System.out.println(entry.getKey()+"--"+entry.getValue()); })
		 */;
		 
		 //empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.reducing(Employee::getSalary,empMax)));
		
		 Map<String, Optional<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		 
			map.entrySet().forEach(entry->{
				 
				  System.out.println(entry.getKey()+"--"+entry.getValue()); });

		
	}
	
}
