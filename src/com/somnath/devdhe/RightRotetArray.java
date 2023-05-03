package com.somnath.devdhe;

public class RightRotetArray {

	public static void main(String[] args) {
		
		int temp;
		int arr[] = {1,2,3,4,5};
		
		//output  ={5,1,2,3,4}
		
		temp = arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			
				arr[i]=arr[i-1]; 
		}
		
		arr[0]=temp;
		for(int i =0 ;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
