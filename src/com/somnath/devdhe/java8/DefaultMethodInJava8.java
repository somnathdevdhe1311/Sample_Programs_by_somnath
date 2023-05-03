package com.somnath.devdhe.java8;

public class DefaultMethodInJava8 {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		demo.default_method();
	}

}

class Demo implements default_inteface{
	
	
}

interface default_inteface{
	
	default void default_method() {
		
		System.out.println("I am from default interface and default method.!!");
	}
}