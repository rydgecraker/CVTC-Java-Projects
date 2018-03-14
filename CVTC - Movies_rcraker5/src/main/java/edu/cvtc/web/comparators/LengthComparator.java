package edu.cvtc.web.comparators;


import java.util.Comparator;

import edu.cvtc.web.modal.Movie;


public class LengthComparator implements Comparator<Movie> {
	
	@Override
	public int compare(Movie movie1, Movie movie2) {
		return movie1.getLengthAsInteger().compareTo(movie2.getLengthAsInteger());
	}
	
}
