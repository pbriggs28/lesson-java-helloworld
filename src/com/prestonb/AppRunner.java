package com.prestonb;

public class AppRunner {

	public void run() {
		String robotOneName = "Hummingbird";
		String robotTwoName = "The Dodo";
		String robotThreeName = "Downasaur";
		String robotFourName = "Cowsncowsncowsncows";
		int robotOneScore = 200;
		int robotTwoScore = 300;
		int robotThreeScore = 285;
		int robotFourScore = 425;
//		int robotOneScore = 200;
//		int robotTwoScore = 200;
//		int robotThreeScore = 200;
//		int robotFourScore = 200;
		int robotOneFeetPerSec = 5;
		int robotTwoFeetPerSec = 8;
		int robotThreeFeetPerSec = 12;
		int robotFourFeetPerSec = 8;
		boolean robotOneEnabled = true;
		boolean robotTwoEnabled = false;
		boolean robotThreeEnabled = true;
		boolean robotFourEnabled = true;

		moveRobot(robotOneName, robotOneEnabled, robotOneFeetPerSec);
		moveRobot(robotTwoName, robotTwoEnabled, robotTwoFeetPerSec);
		moveRobot(robotThreeName, robotThreeEnabled, robotThreeFeetPerSec);
		moveRobot(robotFourName, robotFourEnabled, robotFourFeetPerSec);
		
		judgeCompetition(robotOneName, robotOneScore, robotTwoName, robotTwoScore, robotThreeName, robotThreeScore, robotFourName, robotFourScore);
	}
	
	private void moveRobot(String robotName, boolean enabled, int feetPerSec) {
		if(enabled == true) {
			System.out.println(robotName + " is moving forwards at " + feetPerSec + " feet per second.");			
		} else {
			System.out.println(robotName + " is disabled");
		}
	}
	
	private void judgeCompetition(
			String robotOneName, int robotOneScore, 
			String robotTwoName, int robotTwoScore,
			String robotThreeName, int robotThreeScore, 
			String robotFourName, int robotFourScore) {
		
		if(robotOneScore > robotTwoScore && robotOneScore > robotThreeScore && robotOneScore > robotFourScore) {
			System.out.println(robotOneName + " won!");
		} else if(robotTwoScore > robotOneScore && robotTwoScore > robotThreeScore && robotTwoScore > robotFourScore) {
			System.out.println(robotTwoName + " won!");
		} else if(robotThreeScore > robotOneScore && robotThreeScore > robotTwoScore && robotThreeScore > robotFourScore) {
			System.out.println(robotThreeName + " won!");
		} else if(robotFourScore > robotOneScore && robotFourScore > robotTwoScore && robotFourScore > robotThreeScore) {
			System.out.println(robotFourName + " won!");
		} else {
			System.out.println("It was a tie!");
		}
	}
}
