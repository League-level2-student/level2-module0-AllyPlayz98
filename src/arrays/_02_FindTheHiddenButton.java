/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	int ran;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] bList;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		window.setSize(800, 500);
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String i = JOptionPane.showInputDialog("Enter a positive number in the text box below.");
		int inti = Integer.parseInt(i);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		bList = new JButton[inti];
		// 5. Make a for loop to iterate through the JButton array
		for (int j = 0; j < bList.length; j++) {

			// 6. initialize each JButton in the array
			JButton jb = new JButton();
			bList[j] = jb;
			// 7. add the ActionListener to each JButton
			jb.addActionListener(this);
			// 8. add each JButton to the panel
			panel.add(jb);
		}
		// 9 add the panel to the window
		window.add(panel);
		window.setVisible(true);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object. x

		// 11. set the JFrame to visible. √

		// 12. Give the user the instructions for the game. x

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random r = new Random();
		ran = r.nextInt(inti);
		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		bList[ran].setText("Me!");
		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		bList[ran].setText("");
		window.setSize(800, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
if (bList[ran] == buttonClicked) {
	JOptionPane.showMessageDialog(null, "Congratulations, you win!");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry, try again.");
}
		// 18. else tell them to try again √
	}
}
