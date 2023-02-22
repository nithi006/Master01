package com.assignment.scuba;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [5];
		try {
			a[5]= 50;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}   

	}
}
