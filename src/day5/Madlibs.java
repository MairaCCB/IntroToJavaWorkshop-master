package day5;

import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "If you ever find yourself surrounded by hungry sharks in water...");
		String word1 = JOptionPane.showInputDialog("Enter a liquid");
		String word2 = JOptionPane.showInputDialog("Enter a place");
		String word3 = JOptionPane.showInputDialog("Enter a verb");
		String word4 = JOptionPane.showInputDialog("Enter a body part");
		String word5 = JOptionPane.showInputDialog("Enter the same verb");
		String word6 = JOptionPane.showInputDialog("Enter an adjective");
	
	//Sharks like to live in [type of liquid] in all sorts of places like [a place].
	//Since you are already in the water, try to [verb] away. 
	//They might try to bite your [body part] so [verb] fast.
	//Whatever you do, try to keep the [adjective] shark away from you 
	// and get out of the water as fast as you can. Good Luck!
		
		JOptionPane.showMessageDialog(null, " Sharks like to live in " + word1 + " in all sorts of places like " + word2 + "\n So since you are already in the water, there could be all sorts of different sharks, try to " 
		+ word3 + " away. \n They might try to bite your " + word4 + " so " + word5 + " fast. \n Whatever you do, try to keep the " + word6 + " shark away from you \n and get out of the water as fast as you can. Good luck! ");
		
}
}
