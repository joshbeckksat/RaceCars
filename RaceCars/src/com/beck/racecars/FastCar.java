package com.beck.racecars;

public class FastCar extends BasicCar {
	
	
	public FastCar (float weight, float power)
	{
		super(weight,power);
		
	}
	@Override
	public float calculatespeed()
	{
		float speed = (power * 5 ) / weight;
		return speed;
	}

}
