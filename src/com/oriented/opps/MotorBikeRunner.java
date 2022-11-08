package com.oriented.opps;

public class MotorBikeRunner {

	public static void main(String[] args) {
	      MotorBike ducati = new MotorBike();
	      MotorBike honda = new MotorBike();
	      
	      ducati.start();
	      honda.start();
	  
          ducati.setSpeed(100);
          
          ducati.increaseSpeed(100);
          honda.increaseSpeed(80);
          
          ducati.dicreaseSpeed(20);
          honda.dicreaseSpeed(10);
          
          
          System.out.println(ducati.getSpeed());
          System.out.println(honda.getSpeed());
          
	}
	

}
