package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
JOptionPane.showMessageDialog(null, "You are trapped inside of an old abandoned house, make smart decisions to escape!");
String q1 = JOptionPane.showInputDialog("You are in the basement of the house and it is pitch black, you have to find the door leading to the stairs to get out the basement. \n To your right you hear a slow squeaking sound and to your left you hear something shaking. Which way do you go?");
		if (q1.equalsIgnoreCase("right")) {
			String q2 = JOptionPane.showInputDialog("You found the door leading out of the basement up to the freezing cold living room. \n There is litlle light in the room. Behind you, you hear the sound of slow footsteps coming from the main hallway to leave the house. \n But in front of you, you notice cracks in the wall behind the couch. \n Which way do you go, Door, or Couch?");
			if (q2.equalsIgnoreCase("Couch")) {
				String q3 = JOptionPane.showInputDialog("Wow, you found a secret tunnel leading to the kitchen. The sink is clogged and the room is slowely beginning to flood. \n There is a breeze in front of you, you reach out your hand to feels the area in front of you and it feel like something is bloking you from where the breeze is coming from. \n Where the original tunnel is there another tunnel next to it, where do you go? Tho the tunnel, or the breeze?");
				if (q3.equalsIgnoreCase("breeze")){
					JOptionPane.showMessageDialog(null, "You climb onto the table that was blocking you and pull yourself through the window to your escape!");
					System.exit(0);
				}
				else if (q3.equalsIgnoreCase("tunnel")) {
					JOptionPane.showMessageDialog(null, "You crawl through the tunnel and slip because of the flooding water. \n You take a long fall and land in a spikepit");
					System.exit(0);
				}
			}
			else if (q2.equalsIgnoreCase("door")) {
				JOptionPane.showMessageDialog(null, "The creepy footsteps weren't enough of a warning? You died.");
				System.exit(0);
			}
		}
		else if (q1.equalsIgnoreCase("left")) {
			JOptionPane.showMessageDialog(null, "You made a very bad decision. To your right was the door out of the room, but you decided to go to the shaking box in the corner where a demon climbs out and drags you to the depths of hell.");
				System.exit(0);
		}
		
		
		
	}

}
