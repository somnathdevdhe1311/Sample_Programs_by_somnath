package com.somnath.devdhe;

public class NumberReverse {

	public static void main(String[] args) {
		
		int num = 123456;
		//output =  654321;
		int b ,d=0;
		
		
		while(num>0) {
			
			num = num%10;
			b= num/10;
			d = (d*10)+b;
		}
          System.out.println(d);
	}

}
