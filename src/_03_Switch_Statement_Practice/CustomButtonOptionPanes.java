package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		switch(choice) {
		case "Sunday": 
			System.out.println("School is tommorow");
			break;
		case "Monday":
			System.out.println("Nobody likes Monday");
			break;
		case "Tuesday":
			System.out.println("The day after Monday");
			break;
		case "Wednesday":
			System.out.println("It's Wednesday");
			break;
		case "Thursday":
			System.out.println("Almost Friday");
			break;
		case "Friday":
			System.out.println("Last day of school");
			break;
		case "Saturday":
			System.out.println("Do nothing all day");
			break;
		}
		//use a switch statement to do something cool for each option
		
	}
}
