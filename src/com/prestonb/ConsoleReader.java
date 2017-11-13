package com.prestonb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class ConsoleReader {
	
	public static ArrayList<Robot> promptUserForRobotList() {
		ArrayList<Robot> robotList = new ArrayList<>();
		InputStreamReader consoleInput = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(consoleInput);
		
		int numbOfRobotsToEnter = 4;
		for (int i = 0; i < numbOfRobotsToEnter; i++) {
			Robot robot = promptUserForSingleRobot(br);
			robotList.add(robot);			
		}
		
		return robotList;
	}

	public static Robot promptUserForSingleRobot(BufferedReader br) {
		Robot robot;
		try {
			System.out.println("Robot name: ");
			String input = br.readLine();
			robot = createRobotWithRandomStats(input);
		} catch (IOException e) {
			e.printStackTrace();
			robot = createRobotWithRandomStats("ERROR"); 
		}
		
		return robot;
	}
	
	private static Robot createRobotWithRandomStats(String name) {
		Random randomGenerator = new Random();
		
		int score = randomGenerator.nextInt(1000);
		boolean enabled = randomGenerator.nextBoolean();
		int speed = randomGenerator.nextInt(30);
		
		Robot robot = new Robot(name, enabled, score, speed);
		System.out.println("Created robot... Name: " + robot.name + ". Enabled: " + robot.enabled + ". Score: " + robot.score + ". Speed: " + robot.feetPerSec);
		return robot;
	}
}
