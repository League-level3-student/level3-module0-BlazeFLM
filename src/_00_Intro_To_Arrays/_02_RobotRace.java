package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		// 3. use a for loop to initialize the robots.
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 7. declare that robot the winner and throw it a party!
		// 8. try different races with different amounts of robots.
		// 9. make the robots race around a circular track.
		 circleRobotRace(5);
	}

	static void robotRace(int numOfRobots) {
		Robot[] robots = new Robot[numOfRobots];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setSpeed(100);
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setX(50 + i * 50);
			robots[i].setY(500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean notWon = true;
		int winner = 0;
		while (notWon) {
			for (int i = 0; i < robots.length; i++) {
				Random ran = new Random();
				robots[i].move(ran.nextInt(51));
				// 6. use a while loop to repeat step 5 until a robot has reached the top of the
				// screen.
				if (robots[i].getY() <= 10) {
					notWon = false;
					winner = i;
					break;
				}

			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot #" + (winner + 1) + " is the winner");
		party(robots[winner]);
	}

	static void circleRobotRace(int numOfRobots) {
		Robot[] robots = new Robot[numOfRobots];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setSpeed(100);
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setX(50);
			robots[i].setY(500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean notWon = true;
		int winner = 0;
		while (notWon) {
			for (int i = 0; i < robots.length; i++) {
				Random ran = new Random();
				robots[i].move(ran.nextInt(51));
				// 6. use a while loop to repeat step 5 until a robot has reached the top of the
				// screen.
				if(robots[i].getY() <= 100) {
					robots[i].turn(90);
				}
				if(robots[i].getX() >= 400) {
					robots[i].turn(90);
				}
				if(robots[i].getY() >= 400) {
					robots[i].turn(90);
				}
				if (robots[i].getX() <= 30) {
					notWon = false;
					winner = i;
					break;
				}

			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot #" + (winner + 1) + " is the winner");
		party(robots[winner]);
	}

	static void party(Robot r) {
		for (int j = 0; j < 10; j++) {
			Random rando = new Random();
			r.setX(200);
			r.setY(200);
			r.penDown();
			r.setWindowColor(rando.nextInt(256), rando.nextInt(256), rando.nextInt(256));
			r.setPenColor(rando.nextInt(256), rando.nextInt(256), rando.nextInt(256));
			for (int i = 0; i < rando.nextInt(10); i++) {
				r.turn(rando.nextInt(360));
				r.move(rando.nextInt(400));
			}
		}
	}
}
