/**
 * 
 */
package edu.cvtc.web.util;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.modal.Person;


/**
 * @author Rydge Craker
 *
 */
public class WorkbookUtility {
	
	public static final String INPUT_FILE = "/assets/JavaWebProgramming.xlsx";
	
	
	public static List<Person> retrivePeopleFromWorkbook(final File inputFile) throws InvalidFormatException, IOException {
		
		final List<Person> people = new ArrayList<Person>();
		
		// NOTES: create a workbook from the input file.
		final Workbook workbook = WorkbookFactory.create(inputFile);
		
		final Sheet sheet = workbook.getSheetAt(0);
		// NOTES: iterate over each row in the worksheet from the workbook.
		for (final Row row : sheet) {
			final Cell firstNameCell = row.getCell(0);
			final Cell lastNameCell = row.getCell(1);
			final Cell ageCell = row.getCell(2);
			final Cell favColorCell = row.getCell(3);
			
			// NOTES: create a new person object for each row in the worksheet.
			final Person person = new Person(firstNameCell.getStringCellValue().trim(), lastNameCell.getStringCellValue().trim(), (int) (ageCell.getNumericCellValue()), favColorCell.getStringCellValue().trim());
			
			// NOTES: add each new person to our list of people
			people.add(person);
		}
		return people;
	}
}
