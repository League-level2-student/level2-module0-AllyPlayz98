package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int winner = 0;

		// 2. create an array of 5 robots.
		Robot[] rList = new Robot[8];
		// 3. use a for loop to initialize the robots.
		int posX = 60;
		for (int i = 0; i < rList.length; i++) {
			rList[i] = new Robot();
			rList[i].miniaturize();
			rList[i].moveTo(posX += 100, 500);
			rList[i].setSpeed(10);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// √

		// 5. use another for loop to iterate through the array and make each robot move

		// a random amount less than 50.
		Random ran = new Random();
		int ySmall = 500;
		while (ySmall > 0) {
			for (int i = 0; i < rList.length; i++) {
				int j = ran.nextInt(50);
				rList[i].move(j);
				if (rList[i].getY() < ySmall) {
					ySmall = rList[i].getY();
					winner = i;
				}
			}
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen. √

		}
		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot " + (winner+1) + " won the Robot Race!!!");
		// 8. try different races with different amounts of robots. √

		// 9. make the robots race around a circular track. √
	}
}