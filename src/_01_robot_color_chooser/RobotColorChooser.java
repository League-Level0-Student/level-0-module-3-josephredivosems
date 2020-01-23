//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Borg = new Robot("mini");
		Borg.penDown();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 6; i++) {
			Borg.moveTo(500, 500);
		
		String colorLike = JOptionPane.showInputDialog("What color would you like to draw with?(Red, Blue, or Yellow)");
		//5. Use an if/else statement to set the pen color that the user requested
		if(colorLike.equals("Red")) {
			Borg.setPenColor(Color.RED);
		}
		else if(colorLike.equals("Blue")) {
			Borg.setPenColor(Color.BLUE);
		}
		else if(colorLike.equals("Yellow")) {
			Borg.setPenColor(Color.YELLOW);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else {
			Borg.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Borg.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int j = 0; j < 25; j++) {
		Borg.penDown();
		Borg.setSpeed(100);
		Borg.move(50);
		Borg.turn(1);
		Borg.move(10);
		Borg.turn(100);
		}
		Borg.move(200);
		for (int j = 0; j < 25; j++) {
			Borg.penDown();
			Borg.setSpeed(100);
			Borg.move(50);
			Borg.turn(1);
			Borg.move(10);
			Borg.turn(100);
		}
		Borg.turn(-90);
		Borg.move(100);
		Borg.turn(90);
		for (int j = 0; j < 25; j++) {
			Borg.penDown();
			Borg.setSpeed(100);
			Borg.move(50);
			Borg.turn(1);
			Borg.move(10);
			Borg.turn(100);
		}
	Borg.turn(180);
	Borg.move(100);
	Borg.turn(100);
	
	for (int j = 0; j < 25; j++) {
		Borg.penDown();
		Borg.setSpeed(100);
		Borg.move(50);
		Borg.turn(1);
		Borg.move(10);
		Borg.turn(100);
	}
		}
	}
}
