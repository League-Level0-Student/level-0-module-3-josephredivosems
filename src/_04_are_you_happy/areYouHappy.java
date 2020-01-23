package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {

		String yesOrNo = JOptionPane.showInputDialog("Are you happy?");

		if (yesOrNo.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Okay. Keep doing what you're doing.");
		} else {
			String yesOrNoTwo = JOptionPane.showInputDialog("Do you want to be happy?");

			if (yesOrNoTwo.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}

		}
	}

}
