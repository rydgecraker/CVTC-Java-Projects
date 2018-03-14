package edu.cvtc.web.modal;


import java.io.Serializable;


public class Movie implements Serializable {
	
	private static final long	serialVersionUID	= -7773396779739061160L;
	
	
	private String				title;
	private String				director;
	private int					lengthInMinutes;
	
	
	public Movie() {
		
	}
	
	
	
	public Movie(String title, String director, int lengthInMinutes) {
		this.title = title;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	public String getDirector() {
		return director;
	}
	
	
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	public Integer getLengthAsInteger() {
		return new Integer(lengthInMinutes);
	}
	
	
	public int getLengthInMinutes() {
		return lengthInMinutes;
	}
	
	
	
	public void setLengthInMinutes(int lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}
	
	
	
}
