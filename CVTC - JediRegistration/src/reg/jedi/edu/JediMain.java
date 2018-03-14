package reg.jedi.edu;


import java.util.Scanner;


/**
 * This class is the main jedi class yo. I want to write comments about it, but I really don't give
 * a shit.
 * 
 * @author Rydge
 *
 */
public class JediMain {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		new RegistrationForm();
		
		
		/*
		 * Scanner keyboard = new Scanner(System.in);
		 * System.out.println("Before creating this jedi, there are " + Jedi.JEDI_COUNTER +
		 * " Jedi currently enrolled."); System.out.println("Creating a new jedi..."); Jedi registar
		 * = new Jedi();
		 * 
		 * registar.setPath(loopForInput(keyboard, new String[] { "Guardian", "Sentinel", "Consular"
		 * }, "Path")); System.out.println("Path sucessfully set to: " + registar.getPath() + ".");
		 * 
		 * determineSaberColor(registar);
		 * 
		 * registar.setRank(loopForInput(keyboard, new String[] { "Master", "Knight", "Padawan",
		 * "Youngling" }, "Rank")); System.out.println("Rank sucessfully set to: " +
		 * registar.getRank() + ".");
		 * 
		 * determineTraitMessage(registar, keyboard);
		 * 
		 * determineInstructor(registar);
		 * 
		 * System.out.println("-------------------"); System.out.println(registar.toString());
		 */
		
	}
	
	
	private static void determineSaberColor(Jedi jedi) {
		System.out.println("Determining Lightsaber Color...");
		if (jedi.getPath().equalsIgnoreCase("Guardian")) {
			jedi.setSaberColor("Blue");
		} else if (jedi.getPath().equalsIgnoreCase("Sentinel")) {
			jedi.setSaberColor("Yellow");
		} else if (jedi.getPath().equalsIgnoreCase("Consular")) {
			jedi.setSaberColor("Green");
		} else {
			jedi.setSaberColor("Red");
		}
		
		System.out.println("Lightsaber color set to: " + jedi.getSaberColor() + ".");
	}
	
	
	private static void determineTraitMessage(Jedi jedi, Scanner keyboard) {
		String input = "";
		if (jedi.getPath().equalsIgnoreCase("Guardian")) {
			
			jedi.setUniqueTrait(loopForInput(keyboard, new String[] { "Shii-Cho", "Soresu", "Juyo" }, "Preferred Saber Form"));
			System.out.println("The Saber Form of the Guardian was sucessfully set to " + jedi.getUniqueTrait() + ".");
			
		} else if (jedi.getPath().equalsIgnoreCase("Sentinel")) {
			
			jedi.setUniqueTrait(loopForInput(keyboard, new String[] { "Temple Guardian", "Investigator" }, "Specialization"));
			System.out.println("The specialization of the Sentinel was sucessfully set to " + jedi.getUniqueTrait() + ".");
			
		} else if (jedi.getPath().equalsIgnoreCase("Consular")) {
			System.out.println("Please enter the Consular's signature force power.");
			input = keyboard.nextLine();
			jedi.setUniqueTrait(input);
			System.out.println("The signature force power of the Consular was sucessfully set to " + input + ".");
		}
	}
	
	
	private static void determineInstructor(Jedi jedi) {
		System.out.println("Determining Instructor...");
		if (jedi.getPath().equalsIgnoreCase("Guardian")) {
			if (jedi.getUniqueTrait().equalsIgnoreCase("Shii-Cho")) {
				jedi.setInstructor("Luke Skywalker");
			} else if (jedi.getUniqueTrait().equalsIgnoreCase("Soresu")) {
				jedi.setInstructor("Obi Wan Kenobi");
			} else {
				jedi.setInstructor("Mace Windu");
			}
		} else if (jedi.getPath().equalsIgnoreCase("Sentinel")) {
			if (jedi.getUniqueTrait().equalsIgnoreCase("Temple Guardian")) {
				jedi.setInstructor("Bastila Shan");
			} else {
				jedi.setInstructor("Atton Rand");
			}
		} else if (jedi.getPath().equalsIgnoreCase("Consular")) {
			jedi.setInstructor("Yoda");
		} else {
			System.out.println("ERROR: JEDI IS A SITH.");
		}
		
		System.out.println("Instructor sucessfully set to " + jedi.getInstructor() + ".\nCONGRADULATIONS!");
	}
	
	
	private static String loopForInput(Scanner keyboard, String[] allowedValues, String typeToEnter) {
		String input = "";
		boolean breakWhile = false;
		String allowableInputs = "(";
		for (int i = 0; i < allowedValues.length; i++) {
			if (i != allowedValues.length - 1) {
				allowableInputs += allowedValues[i] + ", ";
			} else {
				allowableInputs += allowedValues[i];
			}
			
		}
		allowableInputs += ")";
		while (!breakWhile) {
			System.out.println("Please give registrant's " + typeToEnter + ": \n" + allowableInputs);
			input = keyboard.nextLine();
			for (int i = 0; i < allowedValues.length; i++) {
				if (input.equalsIgnoreCase(allowedValues[i])) {
					breakWhile = true;
					break;
				}
			}
			if (!breakWhile) {
				System.out.println("Please Enter one of the allowed values");
			}
		}
		
		return input;
	}
}
