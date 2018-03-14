package edu.cvtc.web;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.modal.Person;
import edu.cvtc.web.util.WorkbookUtility;


public class JavaIOExample {
	
	private static final String INPUT_FILE = "WebContent/assets/JavaWebProgramming.xlsx";
	
	
	public static void main(String[] args) {
		// NOTES: Use an input file to print a list of people to the console
		final File inputFile = new File(INPUT_FILE);
		try {
			final List<Person> people = WorkbookUtility.retrivePeopleFromWorkbook(inputFile);
			
			for (final Person person : people) {
				if (person.getFavoriteColor().equalsIgnoreCase("green")) {
					System.out.println(person);
				}
			}
			
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
