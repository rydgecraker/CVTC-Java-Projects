package edu.cvtc.web.dao;


import java.util.List;

import edu.cvtc.web.dao.impl.MovieDaoException;
import edu.cvtc.web.modal.Movie;


public interface MovieDao {
	
	void populate(String filepath) throws MovieDaoException;
	
	
	List<Movie> retriveMovies() throws MovieDaoException;
	
	
	void insertMovie(Movie movie) throws MovieDaoException;
	
}
