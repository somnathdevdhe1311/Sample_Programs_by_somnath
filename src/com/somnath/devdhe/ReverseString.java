package com.somnath.devdhe;


public class ReverseString {

	public static void main(String[] args) {
		
		
		Solution.reverse( "My name is somnath");
		
		

	}
	
	class Solution{
		
		public static String reverse(String input) {
			
			int len = input.length()-1;
			
			  for(int i=len;i>=0;i--) {
				  
				  System.out.print(input.charAt(i)); 
			  }
			return input;
			 
		}
	}

}
