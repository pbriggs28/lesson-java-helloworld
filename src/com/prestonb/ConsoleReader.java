package com.prestonb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class ConsoleReader {
	
	public static ArrayList<Robot> promptUserForRobotList() {
		ArrayList<Robot> robotList = new ArrayList<>();
		try {
			InputStreamReader consoleInput = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(consoleInput);
			System.out.println("Robot name: ");
			String input = br.readLine();
			Robot robot = createRobotWithRandomStats(input);
			robotList.add(robot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return robotList;
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
