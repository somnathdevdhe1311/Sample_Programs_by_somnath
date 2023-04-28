package com.somnath.devdhe;

public class FinalWithParameters {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
				solution.show(10);

	}

}
class Solution{
	
	public  void show( int a) {
		a = 20;
		System.out.println("value of a is:"+a);
	}
}
