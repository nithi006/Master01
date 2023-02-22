package com.assignment.scuba;

abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	public void run() {
		System.out.println("Abstraction example");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.run();

	}

}
