package com.prestonb;

public class AppRunner {

	public void run() {
		Robot robotOne = new Robot("Hummingbird", true, 200, 5);
		Robot robotTwo = new Robot("The Dodo", false, 300, 8);
		Robot robotThree = new Robot("Downasaur", true, 285, 12);
		Robot robotFour = new Robot("Cowsncowsncowsncows", true, 425, 8);
		Robot robotFive = new Robot("Pomelo Pummeler", true, 400, 16);
		Robot robotSix = new Robot("Misfire", true, 800, 20);
		
		Robot[] robotList = new Robot[6];
		robotList[0] = robotOne;
		robotList[1] = robotTwo;
		robotList[2] = robotThree;
		robotList[3] = robotFour;
		robotList[4] = robotFive;
		robotList[5] = robotSix;

		moveAllRobots(robotList);
		
		judgeCompetition(robotList);
	}
	
	private void moveAllRobots(Robot[] robotList) {
		for (int i = 0; i < robotList.length; i++) {
			Robot robot = robotList[i];
			moveRobot(robot);
		}
	}
	
	private void moveRobot(Robot robot) {
		if(robot.enabled == true) {
			System.out.println(robot.name + " is moving forwards at " + robot.feetPerSec + " feet per second.");			
		} else {
			System.out.println(robot.name + " is disabled");
		}
	}
	
	private void judgeCompetition(Robot[] robotList) {
		Robot winningRobot = null;
		int highScore = 0;
		
		for (int i = 0; i < robotList.length; i++) {
			Robot robot = robotList[i];
			
			if(robot.score > highScore) {
				highScore = robot.score;
				winningRobot = robot;
			}
		}
		
		System.out.println();
		System.out.println("Judging...");
		System.out.println(winningRobot.name + " won with a score of: " + highScore);
	}
}
