package com.somnath.devdhe;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo{

	int rollno;  
	String name;  
	int age;  
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	ComparableDemo(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}

	@Override
	public String toString() {
		return "ComparableDemo [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}  

}
