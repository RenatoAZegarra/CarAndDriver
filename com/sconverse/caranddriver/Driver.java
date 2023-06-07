package com.sconverse.caranddriver;

public class Driver extends Car{
	public void drive() {
		if (gas>0) {
			gas -= 1;
			System.out.println("You drove the car.");
			displayGas();
			gameOver();
		} else {
			System.out.println("Cannot drive the car, out of gas.");
			
		}
	}
	
	public void useBoosters() {
		if (gas >= 3) {
			gas -= 3;
			System.out.println("Using Boost");
			displayGas();
			gameOver();
		} else{
			System.out.println("Cannot use biistm not enough gas.");
		}
	}

	
	public void refuel() {
		if (gas <= 9) {
			gas += 2;
			System.out.println("Refueling");
			displayGas();
		} else{
			System.out.println("cannot refuel, gas tank is full.");
		}
	}
	
}
