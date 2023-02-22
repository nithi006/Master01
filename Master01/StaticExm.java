package com.assignment.scuba;

public class StaticExm {
	
	static int age = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExm obj = new StaticExm();
		System.out.println(obj.age);
		showVal();
	}
	static void showVal()
	{
		System.out.println(age);	
	}

}
