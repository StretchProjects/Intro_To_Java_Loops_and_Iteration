/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Loops and iteration
 * Lecture  : http://youtu.be/Bzu4rwflj3g
 * Tutorial : http://youtu.be/W1FGGB3wODY
 * License  : None.  Do with it as you wish! :)
 */

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String input;
		int inputNumber = 0;
		do {
			try {
				input = JOptionPane.showInputDialog("type a number over 5");
				inputNumber = Integer.parseInt(input);
				if (inputNumber == 15) {
					throw new Exception("something");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (inputNumber <= 5  && inputNumber != 0);

	}
}
