package com.sconverse.caranddriver;

public class Car {
	protected int gas;
	
	public Car() {
		gas = 10;
	}
	
	public void displayGas() {
		System.out.println("Gas remaining :" + gas + "/10");
	}
	
	public void gameOver() {
		if(gas == 0) {
			System.out.println("Game Over ! Out of gas.");
		}
	 
	}
	
}
