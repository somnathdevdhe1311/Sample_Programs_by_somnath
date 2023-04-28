package com.somnath.devdhe.java8.pojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByInJava8 {

public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1,"Somnath","Computer","Active",10000,100));
		empList.add(new Employee(21,"Rahul","Mechanical","InActive",29000,101));
		empList.add(new Employee(31,"Akashay","Electrical","Active",13000,102));
		empList.add(new Employee(14,"Yamini","Computer","InActive",14000,103));
		empList.add(new Employee(55,"Zara","Mechanical","Active",55000,104));
		empList.add(new Employee(86,"Karan","Civil","Active",96000,105));

		double result11 = empList.stream().mapToDouble(x->x.getSalary()).skip(2).summaryStatistics().getMin();
		
		// Map<String, Long> count = empList.stream().collect(Collectors.groupingBy(Employee::getStatus, Collectors.counting()));
		 
		List<Employee> result = empList.stream().filter(x ->x.getStatus().equals("Active")).collect(Collectors.toList());
		
		Optional<Double> heighest = empList.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		//Optional<Double> maxSalary = empList.stream().max(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);;
		
		Optional<Double> minSalary = empList.stream().map(x -> x.getSalary()).sorted().skip(1).findFirst();
		
		List<Employee> sortedList = empList.parallelStream().sorted(Comparator.comparing(Employee::getDeptId).reversed()).collect(Collectors.toList());
		
		List<Double> salarySort = empList.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		 Stream<Employee> list = empList.stream().filter(x ->x.getName().startsWith("So"));
		 
		 Optional<Double> thirdheighest = empList.stream().map(x->x.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
		 Optional<Employee> empMax = empList.stream().max(Comparator.comparing(Employee::getSalary));
		Map<String, Long> count = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		 
	
		List<String> nameSorted = empList.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(result11);
    }
}
