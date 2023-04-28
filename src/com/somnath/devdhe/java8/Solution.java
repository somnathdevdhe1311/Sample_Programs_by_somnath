package com.somnath.devdhe.java8;

public class Solution {

	public static void main(String[] args) {
		
		B a = new B();
		//System.out.println(x);
		System.out.println(a.x);
		a.a(null);
	}
}
class A{
	
	A(){
		System.out.println("constructor form A");
	};
	int x= 10;
	public void a(String str) {
		System.out.println("form A  "+str);
	}
}

class B extends A{
	B(){
		//super();
		System.out.println("constructor form B");
	};
	int x = 20;
	public void a(int o) {
		System.out.println("form B"+o);
	}
}
