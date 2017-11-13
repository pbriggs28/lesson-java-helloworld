package com.prestonb;

public class AppRunner {

	public void run() {
		Robot robotOne = new Robot();
		Robot robotTwo = new Robot();
		Robot robotThree = new Robot();
		Robot robotFour = new Robot();
		
		robotOne.name = "Hummingbird";
		robotOne.score = 200;
		robotOne.feetPerSec = 5;
		robotOne.enabled = true;
		
		robotTwo.name = "The Dodo";
		robotTwo.score = 300;
		robotTwo.feetPerSec = 8;
		robotTwo.enabled = false;
		
		robotThree.name = "Downasaur";
		robotThree.score = 285;
		robotThree.feetPerSec = 12;
		robotThree.enabled = true;
		
		robotFour.name = "Cowsncowsncowsncows";
		robotFour.score = 425;
		robotFour.feetPerSec = 8;
		robotFour.enabled = true;
		
		moveRobot(robotOne.name, robotOne.enabled, robotOne.feetPerSec);
		moveRobot(robotTwo.name, robotTwo.enabled, robotTwo.feetPerSec);
		moveRobot(robotThree.name, robotThree.enabled, robotThree.feetPerSec);
		moveRobot(robotFour.name, robotFour.enabled, robotFour.feetPerSec);
		
		judgeCompetition(robotOne.name, robotOne.score, robotTwo.name, robotTwo.score, robotThree.name, robotThree.score, robotFour.name, robotFour.score);
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
