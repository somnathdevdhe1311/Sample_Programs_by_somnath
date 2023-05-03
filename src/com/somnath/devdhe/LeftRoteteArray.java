package com.somnath.devdhe;

public class LeftRoteteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int arr[] = {1,2,3,4,5};
		
		//output [2,3,4,5,1];
		
		//Right Side shifting  {1,2,3,4,5} ={5,1,2,3,4} 
		temp = arr[0];
		
		for(int i =0 ;i< arr.length;i++) {
			if(i!=arr.length-1) {
				
				arr[i] = arr[i+1];
			}
			//2,3,4,5,1
		}
		
		arr[arr.length-1]=temp;
		
		for(int i =0 ;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}

}
