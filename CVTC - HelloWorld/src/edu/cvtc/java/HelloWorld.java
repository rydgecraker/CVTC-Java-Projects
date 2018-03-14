/**
 * 
 */
package edu.cvtc.java;


/**
 * @author Rydge
 *
 */
public class HelloWorld {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = "";
		
		if (name.isEmpty()) {
			System.out.println("Could not say hello to nobody!");
		} else {
			System.out.println("Hello " + name + "!");
		}
		
	}
	
}
