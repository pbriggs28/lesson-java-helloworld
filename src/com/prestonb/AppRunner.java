package com.prestonb;

public class AppRunner {

	public void run() {
		String robotOneName = "Hummingbird";
		String robotTwoName = "The Dodo";
		int robotOneScore = 300;
//		int robotTwoScore = 200;
		int robotTwoScore = 300;
//		int robotTwoScore = 400;

		System.out.println(robotOneName + " score: " + robotOneScore);
		System.out.println(robotTwoName + " score: " + robotTwoScore);

		if(robotOneScore > robotTwoScore) {
			System.out.println(robotOneName + " won!");
		} else if(robotTwoScore > robotOneScore) {
			System.out.println(robotTwoName + " won!");
		} else if(robotTwoScore == robotOneScore) {
			System.out.println("It was a tie!");
		}
	}
}
