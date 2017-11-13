package com.prestonb;

public class AppRunner {

	public void run() {
		String robotOneName = "Hummingbird";
		String robotTwoName = "The Dodo";
		int robotOneScore = 300;
		int robotTwoScore = 200;

		System.out.println(robotOneName + " score: " + robotOneScore);
		System.out.println(robotTwoName + " score: " + robotTwoScore);

		if(robotOneScore > robotTwoScore) {
			System.out.println("Robot one won!");
		} else if(robotTwoScore > robotOneScore) {
			System.out.println("Robot two won!");
		} else if(robotTwoScore == robotOneScore) {
			System.out.println("It was a tie!");
		}
	}
}
