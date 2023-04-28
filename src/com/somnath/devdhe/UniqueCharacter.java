package com.somnath.devdhe;

public class UniqueCharacter {

	public static void main(String[] args) {

		String name = "HelloWelcomeW";

		String temp = "";

		/*
		 * for (int i = 0; i < name.length(); i++) { char current = name.charAt(i); if
		 * (temp.indexOf(current) < 0) { temp = temp + current; } else { temp =
		 * temp.replace(String.valueOf(current), ""); } }
		 */
		char c = 0 ;
		
		for (int i = 0; i < name.length(); i++) {
			int count=0;
			for (int j = 0; j < name.length(); j++) {
				if(name.charAt(i)==name.charAt(j) && i!=j) {
					
					count++;
				}
			}
			if(count==0) {
				
				System.out.println(c + " ");
			}
		}
		
		
	}

}
