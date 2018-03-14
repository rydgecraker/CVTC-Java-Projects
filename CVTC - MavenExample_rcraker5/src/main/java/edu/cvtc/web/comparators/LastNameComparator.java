/**
 * 
 */
package edu.cvtc.web.comparators;


import java.util.Comparator;

import edu.cvtc.web.modal.Person;


/**
 * @author Rydge
 *
 */
public class LastNameComparator implements Comparator<Person> {
	
	@Override
	public int compare(Person person1, Person person2) {
		return person1.getLastName().compareTo(person2.getLastName());
	}
	
}
