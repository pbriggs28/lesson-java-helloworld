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

		moveRobot(robotOneName, robotOneEnabled, robotOneFeetPerSec);
		moveRobot(robotTwoName, robotTwoEnabled, robotTwoFeetPerSec);
		
		judgeCompetition(robotOneName, robotOneScore, robotTwoName, robotTwoScore);
	}
	
	private void moveRobot(String robotName, boolean enabled, int feetPerSec) {
		if(enabled == true) {
			System.out.println(robotName + " is moving forwards at " + feetPerSec + " feet per second.");			
		} else {
			System.out.println(robotName + " is disabled");
		}
	}
	
	private void judgeCompetition(String robotOneName, int robotOneScore, String robotTwoName, int robotTwoScore) {
		if(robotOneScore > robotTwoScore) {
			System.out.println(robotOneName + " won!");
		} else if(robotTwoScore > robotOneScore) {
			System.out.println(robotTwoName + " won!");
		} else if(robotTwoScore == robotOneScore) {
			System.out.println("It was a tie!");
		}
	}
}
