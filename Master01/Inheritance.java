package com.assignment.scuba;

class Doctor{
	float salary = 50000;
}
class Surgeon extends Doctor{
	float bonus = 20000;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon s = new Surgeon();
		System.out.println("Salary of surgeon" + s.salary);
		System.out.println("Bonus of surgeon" + s.bonus);
	}
}
