package edu.cvtc.web.servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoException;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.modal.Movie;


/**
 * Servlet implementation class AddMovieController
 */
@WebServlet(name = "AddMovie", urlPatterns = { "/AddMovie" })
public class AddMovieController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = null;
		
		try {
			
			final String titleStr = request.getParameter("title");
			final String directorStr = request.getParameter("director");
			final String lengthStr = request.getParameter("length");
			
			if (isEmptyOrNull(titleStr) || isEmptyOrNull(directorStr) || isEmptyOrNull(lengthStr)) {
				request.setAttribute("message", "You must complete all fields to submit the form");
				target = "error.jsp";
			} else {
				final int length = Integer.parseInt(lengthStr);
				
				final MovieDao movieDao = new MovieDaoImpl();
				
				final Movie movie = new Movie(titleStr, directorStr, length);
				
				movieDao.insertMovie(movie);
				
				request.setAttribute("message", "The movie has been added to the database.");
				target = "success.jsp";
			}
			
		} catch (MovieDaoException e) {
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
			target = "error.jsp";
		} catch (NumberFormatException e) {
			e.printStackTrace();
			request.setAttribute("message", "Error: you must enter a numeric value for length.");
			target = "error.jsp";
		}
		
		request.getRequestDispatcher(target).forward(request, response);
	}
	
	
	private boolean isEmptyOrNull(String s) {
		return s == null || s.trim().length() == 0;
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
