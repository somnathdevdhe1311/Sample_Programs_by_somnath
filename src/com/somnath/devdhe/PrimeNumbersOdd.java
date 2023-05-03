package com.somnath.devdhe;

public class PrimeNumbersOdd {

	public static void main(String[] args) {
	
		int i =0,j=0, num=10,var=0;
		for(i=1 ;i<=num;i++) {
			var=i;
			int count = 0;
			for(j=1; j<=num;j++) {
				if(var%j==0) {
					
					count++;
				}
			}
			if(count==2) {
				
				System.out.println(var);
				
			}
			
			
		}
		
	}

}
