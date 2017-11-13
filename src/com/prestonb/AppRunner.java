package com.prestonb;

import java.util.ArrayList;

public class AppRunner {

	public void run() {
		ArrayList<Robot> robotList = ConsoleReader.promptUserForRobotList();
		moveAllRobots(robotList);
		judgeCompetition(robotList);
	}
	
	private void moveAllRobots(ArrayList<Robot> robotList) {
		System.out.println();
		System.out.println("===================================== Moving Robots");
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
		System.out.println("===================================== Judging");
		System.out.println(winningRobot.name + " won with a score of: " + highScore);
	}
}
