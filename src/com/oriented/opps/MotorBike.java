package com.oriented.opps;

public class MotorBike {
	private int speed;
	

     public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	public void dicreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}   


	void start() { 	
    	 System.out.println("Bike Started");
     }
}
