/**
 * 
 */
package edu.cvtc.web.comparators;


import java.util.Comparator;

import edu.cvtc.web.modal.Movie;


/**
 * @author Rydge
 *
 */
public class DirectorComparator implements Comparator<Movie> {
	
	@Override
	public int compare(Movie movie1, Movie movie2) {
		return movie1.getDirector().compareTo(movie2.getDirector());
	}
	
}
