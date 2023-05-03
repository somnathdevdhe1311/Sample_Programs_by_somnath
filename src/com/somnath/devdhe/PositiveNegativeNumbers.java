package com.somnath.devdhe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,-2,-3,0,-2,4,-5,9};
		//[-3,-2,-5,0,1,2,4,9];
		ArrayList<Integer> set = new ArrayList<>();
		
		set.add(54);
		set.add(43);
		set.add(33);
		set.add(222);
		set.add(101);
		
		set.remove(222);
		
		System.out.println(set);
/*
 * int j=0; int temp=0; for(int i=0 ;i<arr.length; i++) {
 * 
 * if(arr[i]<0) { temp= arr[i];
 * 
 * arr[i]=arr[j]; arr[j]= temp;
 * 
 * j++;
 * 
 * }
 * 
 * }
 */
	}

}
