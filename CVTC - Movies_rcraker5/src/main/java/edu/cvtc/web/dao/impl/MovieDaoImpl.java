/**
 * 
 */
package edu.cvtc.web.dao.impl;


import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.modal.Movie;
import edu.cvtc.web.util.DBUtility;
import edu.cvtc.web.util.WorkbookUtility;


/**
 * @author Rydge
 *
 */
public class MovieDaoImpl implements MovieDao {
	
	private static final String	DROP_TABLE_MOVIE		= "drop table if exists movie;";
	private static final String	CREATE_TABLE_MOVIE		= "create table movie (id integer primary key autoincrement, title text, director text, length integer);";
	
	private static final String	SELECT_ALL_FROM_MOVIE	= "select * from movie;";
	
	
	@Override
	public void populate(String filepath) throws MovieDaoException {
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = DBUtility.createConnection();
			statement = connection.createStatement();
			
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			statement.executeUpdate(DROP_TABLE_MOVIE);
			statement.executeUpdate(CREATE_TABLE_MOVIE);
			
			final File inputFile = new File(filepath);
			final List<Movie> movies = WorkbookUtility.retriveMoviesFromWorkbook(inputFile);
			
			for (Movie movie : movies) {
				final String insertValues = "insert into movie (title, director, length) " + "values ('" + movie.getTitle() + "', " + "'" + movie.getDirector() + "', " + "'" + movie.getLengthInMinutes() + "');";
				System.out.println(insertValues);
				
				statement.executeUpdate(insertValues);
			}
			
			
		} catch (ClassNotFoundException | SQLException | InvalidFormatException | IOException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: Unable to populate the database.");
		} finally {
			DBUtility.closeConnections(connection, statement);
		}
	}
	
	
	@Override
	public List<Movie> retriveMovies() throws MovieDaoException {
		final List<Movie> movies = new ArrayList<Movie>();
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = DBUtility.createConnection();
			statement = connection.createStatement();
			
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			final ResultSet resultSet = statement.executeQuery(SELECT_ALL_FROM_MOVIE);
			
			
			while (resultSet.next()) {
				
				final String title = resultSet.getString("title");
				final String director = resultSet.getString("director");
				final int length = resultSet.getInt("length");
				
				movies.add(new Movie(title, director, length));
				
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: Unable to retrieve people.");
		} finally {
			DBUtility.closeConnections(connection, statement);
		}
		
		return movies;
	}
	
	
	@Override
	public void insertMovie(Movie movie) throws MovieDaoException {
		Connection connection = null;
		PreparedStatement insertStatement = null;
		
		try {
			connection = DBUtility.createConnection();
			final String sqlStatement = "insert into movie (title, director, length) values (?,?,?);";
			insertStatement = connection.prepareStatement(sqlStatement);
			
			insertStatement.setString(1, movie.getTitle());
			insertStatement.setString(2, movie.getDirector());
			insertStatement.setInt(3, movie.getLengthInMinutes());
			
			insertStatement.setQueryTimeout(DBUtility.TIMEOUT);
			
			insertStatement.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: to add this person to the database.");
		} finally {
			DBUtility.closeConnections(connection, insertStatement);
		}
	}
	
}
