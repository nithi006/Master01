package com.assignment.scuba;

class hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			
			}
		}
}
class hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
		}
	}
}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MultiThreading Example");
		hello obj1= new hello();
		hi obj2 = new hi();
		obj1.start();
		obj2.start();
	}
}


