package edu.cvtc.web.servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.PersonDao;
import edu.cvtc.web.dao.impl.PersonDaoException;
import edu.cvtc.web.dao.impl.PersonDaoImpl;
import edu.cvtc.web.modal.Person;


@WebServlet(name = "AddPerson", urlPatterns = { "/AddPerson" })
public class AddPersonController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		try {
			
			final String firstName = request.getParameter("firstName");
			final String lastName = request.getParameter("lastName");
			final String ageString = request.getParameter("age");
			final String favoriteColor = request.getParameter("favoriteColor");
			
			if (isEmptyOrNull(firstName) || isEmptyOrNull(lastName) || isEmptyOrNull("age") || isEmptyOrNull(favoriteColor)) {
				request.setAttribute("message", "You must complete all fields to submit the form");
				target = "error.jsp";
			} else {
				final int age = Integer.parseInt(ageString);
				
				final PersonDao personDao = new PersonDaoImpl();
				
				final Person person = new Person(firstName, lastName, age, favoriteColor);
				
				personDao.insertPerson(person);
				
				request.setAttribute("message", "The person has been added to the database.");
				target = "success.jsp";
			}
			
		} catch (PersonDaoException e) {
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
			target = "error.jsp";
		} catch (NumberFormatException e) {
			e.printStackTrace();
			request.setAttribute("message", "Error: you must enter a numeric value for age.");
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
