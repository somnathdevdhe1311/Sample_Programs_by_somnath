package com.somnath.devdhe;

public class ZerosAtRightSide {

	public static void main(String[] args) {
		
		int[] arr = {1,0,-9,0,4,0,0,-2,-7,4,-6,8,-9};
		
		int n = 0;
		
		for (int i = 0; i < arr.length-n; i++) {
			
	        if (arr[i] == 0) {
	        	int temp =arr[arr.length-1-n];  //9
	        	arr[arr.length-1-n]= arr[i];  
	        	arr[i]=temp;
	        	
	        	n++;
	        }
	        	  
		}
		
		 for (int i = 0; i<arr.length; i++) {
			  System.out.println(arr[i] + " "); }
	}

}
