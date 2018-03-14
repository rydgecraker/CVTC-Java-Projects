/**
 * 
 */
package edu.cvtc.web.dao;


import java.util.List;

import edu.cvtc.web.dao.impl.PersonDaoException;
import edu.cvtc.web.modal.Person;


/**
 * @author Rydge
 *
 */
public interface PersonDao {
	
	void populate(String filepath) throws PersonDaoException;
	
	
	List<Person> retrivePeople() throws PersonDaoException;
	
	
	void insertPerson(Person person) throws PersonDaoException;
	
}
