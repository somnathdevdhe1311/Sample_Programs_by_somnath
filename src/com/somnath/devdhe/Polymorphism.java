package com.somnath.devdhe;

class ABC{
	   public void myMethod()
	   {
		System.out.println("Overridden method");
	   }	   
	}
	class Polymorphism extends ABC{
	   public void myMethod(){
		//This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method");
	   }
	   public static void main( String args[]) {
		   Polymorphism obj = new Polymorphism();
		obj.myMethod();
	   }
	}