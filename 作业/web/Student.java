package com.web;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int age;
	
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
