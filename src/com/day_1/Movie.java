package com.day_1;

public class Movie {
	int movieid;
	String moviename;
	int rating;
	public Movie(int movieid, String moviename, int rating) {
	
		this.movieid = movieid;
		this.moviename = moviename;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", rating=" + rating + "]";
	}
	
	
	
	

}
