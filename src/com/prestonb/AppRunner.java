package com.prestonb;

public class AppRunner {

	public void run() {
		Robot robotOne = new Robot("Hummingbird", true, 200, 5);
		Robot robotTwo = new Robot("The Dodo", false, 300, 8);
		Robot robotThree = new Robot("Downasaur", true, 285, 12);
		Robot robotFour = new Robot("Cowsncowsncowsncows", true, 425, 8);

		moveRobot(robotOne);
		moveRobot(robotTwo);
		moveRobot(robotThree);
		moveRobot(robotFour);
		
		judgeCompetition(robotOne, robotTwo, robotThree, robotFour);
	}
	
	private void moveRobot(Robot robot) {
		if(robot.enabled == true) {
			System.out.println(robot.name + " is moving forwards at " + robot.feetPerSec + " feet per second.");			
		} else {
			System.out.println(robot.name + " is disabled");
		}
	}
	
	private void judgeCompetition(Robot robotOne, Robot robotTwo, Robot robotThree, Robot robotFour) {
		
		if(robotOne.score > robotTwo.score && robotOne.score > robotThree.score && robotOne.score > robotFour.score) {
			System.out.println(robotOne.name + " won!");
		} else if(robotTwo.score > robotOne.score && robotTwo.score > robotThree.score && robotTwo.score > robotFour.score) {
			System.out.println(robotTwo.name + " won!");
		} else if(robotThree.score > robotOne.score && robotThree.score > robotTwo.score && robotThree.score > robotFour.score) {
			System.out.println(robotThree.name + " won!");
		} else if(robotFour.score > robotOne.score && robotFour.score > robotTwo.score && robotFour.score > robotThree.score) {
			System.out.println(robotFour.name + " won!");
		} else {
			System.out.println("It was a tie!");
		}
	}
}
