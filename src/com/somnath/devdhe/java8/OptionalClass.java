package com.somnath.devdhe.java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		String str[] = new String[10];
		
		Optional<String> myName  = Optional.of("Somnath");
		
		Optional<String> emptyString = Optional.empty();
				
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()){
		    String str1 = str[5].toUpperCase();
			System.out.println(str1);
		}else {
			System.out.println("value is null");
		}
	}
}
