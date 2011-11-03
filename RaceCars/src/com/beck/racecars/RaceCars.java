package com.beck.racecars;

import java.util.Random;

public class RaceCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RedCar redcar = new RedCar(1,1);
//Assignment 1:
//write a line of code that sets the new color of the car using 'setcolor' from the BasicCar class
Random taco = new Random();
float randompower = taco.nextInt(101);
float randomweight = taco.nextInt(101);


redcar.setcolor("ponies");
redcar.setpower(10);
redcar.setweight(10);

String color = redcar.getcolor();
float speed = redcar.calculatespeed();
System.out.println("The speed of your car is currently " + speed);
System.out.println("The color of your car is currently " + color);
System.out.println("The weight of your car is currently " + redcar.weight);
//End redcar

FastCar fastcar = new FastCar(1,1);
fastcar.setcolor("rainbows");
fastcar.setpower(10);
fastcar.setweight(10);

String color1 = fastcar.getcolor();
float speed1 = fastcar.calculatespeed();
System.out.println("The speed of fastcar  is currently " + speed);
System.out.println("The color of fastcar is currently " + color);
System.out.println("The weight of fastcar is currently " + fastcar.weight);



System.out.println("The power of your car is currently " + fastcar.power);



}

}
