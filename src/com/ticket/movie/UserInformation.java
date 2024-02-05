package com.ticket.movie;

import java.util.Scanner;
public class UserInformation {
	Scanner input = new Scanner(System.in);
	void userDetails() {
		System.out.println("Enter Your Mobile Number");
		 long mobileNumber = input.nextLong();
		System.out.println("Enter Your Email Address");
		String email = input.next();
		 }
}
