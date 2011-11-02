package com.beck.racecars;

public class BasicCar {
	public float weight = 0;
	public float power = 0;
	public String color = "blue";
   public BasicCar(float weight, float power)
   {
	   this.weight = weight;
	   this.power = power;
   }
   public String getcolor()
   {
	   return color;
	   
   }
   public void setcolor(String newcolor)
   {
	   color = newcolor;
   }
   public void setpower(float newpower)
   {
	   power = newpower;
   }
   public void setweight(float newweight)
   {
	   weight = newweight;
   }
   public float calculatespeed()
   {
	   float speed = power/weight;
	   return speed;
   }

}
