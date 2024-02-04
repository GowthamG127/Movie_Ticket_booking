package com.ticket.movie;
import java.util.Scanner;
public class SelectTheSeat extends Foods{

	Scanner input = new Scanner(System.in);
	public void seatSelection() {
		System.out.println("Select the Class Type");
		System.out.println("1. Balcony"+"\n"+"2. First Class"+"\n"+"3. Second Class"+"\n"+"4. Exit");
		int type = input.nextInt();
		switch (type){
		case 1:
			balcony();
			break;
		case 2:
		//	firstClass();
			break;
		case 3:
		//	secondClass();
			break;
		case 4:
			System.out.println("Have a Nice Day");
			System.exit(0);
		}
	}
	
	void balcony() {
		System.out.println("Available Seats");
		System.out.println("Balcony Seats (1-5)"+" "+"(16-18)"+" "+"(21)");
		System.out.println("Enter No of Seats");
		int noOfSeat = input.nextInt();
		int[] balconySeat = new int [noOfSeat];
		System.out.println("Select your seats");
		for(int seatRow=0;seatRow<balconySeat.length;seatRow++) {
			balconySeat[seatRow] = input.nextInt();
			System.out.println(balconySeat[seatRow]);
		}
			System.out.println("Your Seats");
			System.out.println("========================");
		for(int seatRow=0;seatRow<balconySeat.length;seatRow++) {
			System.out.print("Seat No :"+balconySeat[seatRow]+" ");
		}
			System.out.println("\n"+"Foods and Beverages");
			System.out.println("1. Order"+"\n"+"2. Skip");
			int choice = input.nextInt();
			switch(choice){
				case 1:
					orderFoods();
				// create user details and call them here
					break;
				case 2:
					// create user details and call them here
					break;
					
			}
	}
	
	
	}

