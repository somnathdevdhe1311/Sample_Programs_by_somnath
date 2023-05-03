package com.somnath.devdhe;

public class ZerosAtLastOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1,-9,8,4,0,0,-2,-7,0,-6,0,-9};
		
		int n = arr.length; //12
		int count = 0;
		
		for (int i = 0; i < n; i++) {
	        if (arr[i] != 0)
	            arr[count++] = arr[i];  //[1,8,4,2,7,6,9] =8 
		}
	    for (int i = count; i<n;i++) {
	        arr[i]=0;
	    }

		/*
		 * for (int i = n-1; i >= 0; i--) { System.out.print(arr[i] + " "); }
		 */
	
	  for (int i = 0; i<arr.length; i++) {
	  System.out.println(arr[i] + " "); }
	 
}
	
}
