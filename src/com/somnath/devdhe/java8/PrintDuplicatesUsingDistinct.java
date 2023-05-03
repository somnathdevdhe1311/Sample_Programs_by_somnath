package com.somnath.devdhe.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicatesUsingDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> cars = new ArrayList<>(
	                List.of(
	                        "Mercedes",
	                        "Toyota",
	                        "Nissan",
	                        "Volkswagen",
	                        "Ford",
	                        "Maclaren",
	                        "Mercedes",
	                        "Nissan",
	                        "Ford"
	                )
	        );
	 
	        List<String> distinctCars = cars.stream()
	                .distinct()
	                .collect(Collectors.toList());
	        
	        for (String distinctCar : distinctCars) {
	            cars.remove(distinctCar);
	        }
	 
	        cars.forEach(System.out::println);
	}

}
