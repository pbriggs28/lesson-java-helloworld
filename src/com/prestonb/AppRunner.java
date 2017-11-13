package com.prestonb;

import java.util.ArrayList;

public class AppRunner {

	public void run() {
		Robot robotOne = new Robot("Hummingbird", true, 200, 5);
		Robot robotTwo = new Robot("The Dodo", false, 300, 8);
		Robot robotThree = new Robot("Downasaur", true, 285, 12);
		Robot robotFour = new Robot("Cowsncowsncowsncows", true, 425, 8);
		Robot robotFive = new Robot("Pomelo Pummeler", true, 400, 16);
		Robot robotSix = new Robot("Misfire", true, 800, 20);
		
		ArrayList<Robot> robotList = new ArrayList<>();
		robotList.add(robotOne);
		robotList.add(robotTwo);
		robotList.add(robotThree);
		robotList.add(robotFour);
		robotList.add(robotFive);
		robotList.add(robotSix);

		moveAllRobots(robotList);
		
		judgeCompetition(robotList);
	}
	
	private void moveAllRobots(ArrayList<Robot> robotList) {
		for (Robot robot : robotList) {
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
	
	private void judgeCompetition(ArrayList<Robot> robotList) {
		Robot winningRobot = null;
		int highScore = 0;
		
		for (Robot robot : robotList) {
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
