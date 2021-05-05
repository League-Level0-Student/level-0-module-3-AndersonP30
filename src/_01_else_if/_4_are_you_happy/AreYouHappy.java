package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		/**
		 * if(somethingHappens) { does stuff } else if(somethingElseHappens) { does
		 * something else } else { does other stuff }
		 */

		String q1 = JOptionPane.showInputDialog("Are you happy?");
		if (q1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Then you should keep doing what you're doing");
		}
		else if (q1.equalsIgnoreCase("no")) {
			String q2 = JOptionPane.showInputDialog("Do you really want to be happy?");

			if (q2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "You should do activities that you enjoy");
			}
			if (q2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "You should really see a therapist...");
			}
		}

		else
			JOptionPane.showMessageDialog(null, "Just say YES or NO!");

	}

}
