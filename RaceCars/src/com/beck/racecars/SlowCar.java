package com.beck.racecars;

public class SlowCar extends BasicCar {
	
	public SlowCar (float weight, float power)
	{
		super(weight,power);
	}

	public float Calculatespeed()
	{
		float speed = (power / 5) / weight;
		return speed;
	}

}
