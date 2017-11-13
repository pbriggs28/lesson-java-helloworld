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
		boolean quit = false;

		System.out.println("===================================== Entering Robots");
		while (quit == false) {
			Robot robot = promptUserForSingleRobot(br);
			robotList.add(robot);			

			quit = isUserDoneEnteringRobots(br);
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
	
	private static boolean isUserDoneEnteringRobots(BufferedReader br) {
		boolean done;
		
		try {
			System.out.println("Enter more robots?");
			String input = br.readLine();
			if(input.equals("Yes")) {
				System.out.println("Input [" + input + "] equals [Yes]. Entering another robot..");
				done = false;
			} else {
				System.out.println("Input [" + input + "] does not equal [Yes]. Done entering robots..");
				done = true;
			}
		} catch (IOException e) {
			System.out.println("ERROR: Exception occurred reading input:");
			e.printStackTrace();
			done = true;
			System.out.println("Done entering robots..");
		}
		
		return done;
	}
}
