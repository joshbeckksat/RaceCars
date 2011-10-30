package com.beck.racecars;

public class RaceCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RedCar redcar = new RedCar(1,1);
//Assignment 1:
//write a line of code that sets the new color of the car using 'setcolor' from the BasicCar class

String color = redcar.getcolor();
System.out.println("The color of your car is currently " + color);
System.out.println("The weight of your car is currently " + redcar.weight);

//Assignment 2:
//Write a line of code that changes the power of redcar to 10.

System.out.println("The weight of your car is currently " + redcar.power);



}

}
