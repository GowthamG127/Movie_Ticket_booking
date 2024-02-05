package com.ticket.movie;

//MovieTicket extends one of it's super class SelectTheClass
public class MovieTicket extends SelectTheSeat{
	// Main method is called.
	public static void main(String[] args) {
		MovieTicket movie = new MovieTicket();
		//seatSelection method is called.
		movie.seatSelection();
	}
}
