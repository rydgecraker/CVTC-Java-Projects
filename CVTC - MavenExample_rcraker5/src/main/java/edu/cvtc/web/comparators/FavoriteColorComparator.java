package edu.cvtc.web.comparators;


import java.util.Comparator;

import edu.cvtc.web.modal.Person;


public class FavoriteColorComparator implements Comparator<Person> {
	
	@Override
	public int compare(Person person1, Person person2) {
		return person1.getFavoriteColor().compareTo(person2.getFavoriteColor());
	}
	
}
