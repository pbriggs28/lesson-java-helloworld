package com.prestonb;

public class AppRunner {

	public void run() {
		String robotOneName = "Hummingbird";
		String robotTwoName = "The Dodo";
		int robotOneScore = 200;
		int robotTwoScore = 300;
		int robotOneFeetPerSec = 5;
		int robotTwoFeetPerSec = 8;
		boolean robotOneEnabled = true;
		boolean robotTwoEnabled = false;

		System.out.println("Robot one is moving forwards at " + robotOneFeetPerSec + " feet per second.");
		System.out.println("Robot two is moving forwards at " + robotOneFeetPerSec + " feet per second.");
		
		if(robotOneScore > robotTwoScore) {
			System.out.println(robotOneName + " won!");
		} else if(robotTwoScore > robotOneScore) {
			System.out.println(robotTwoName + " won!");
		} else if(robotTwoScore == robotOneScore) {
			System.out.println("It was a tie!");
		}
	}
}
