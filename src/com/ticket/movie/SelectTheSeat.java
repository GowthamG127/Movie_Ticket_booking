package com.ticket.movie;
import java.util.Date;
import java.util.Scanner;
//SelectTheSeat class inherits it's super class Foods
public class SelectTheSeat extends Foods{
	//Scanner class is declared globally
	Scanner input = new Scanner(System.in);
	//main method calls this seatSelection
	public void seatSelection() {
		//user can select any one of these type as their preference.
		System.out.println("Select the Class Type");
		// user must exit from the condition to close the looping
		while(true) {
		System.out.println("1. Balcony"+"\n"+"2. First Class"+"\n"+"3. Second Class"+"\n"+"4. Exit");
		int type = input.nextInt();
		switch (type){
		case 1:
			balcony();
			thanksMessage();
			break;
		case 2:
			firstClass();
			thanksMessage();
			break;
		case 3:
			secondClass();
			thanksMessage();
			break;
		case 4:
			System.out.println("Have a Nice Day");
			System.exit(0);
		}
		}
	}
	
	void balcony() {
		System.out.println("Balcony contains a single row");
		System.out.println("Balcony Seats From 1-12");
		System.out.println("Enter No of Seats upto 5");
		int noOfSeat = input.nextInt();
		if(noOfSeat<=5) {
			//Array is getting dynamic from the user
			//One Dimensional Array is used.
		int[] balconySeat = new int [noOfSeat];
		double amount = noOfSeat * 250;
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
		//If user want to select foods by selecting the options
			System.out.println("\n"+"Foods and Beverages");
			System.out.println("1. Order"+"\n"+"2. Skip");
			int choice = input.nextInt();
			switch(choice){
				case 1:
					orderFoods();
					userDetails();
					getFoodBill();
					System.out.println("Ticket Price Rs."+amount);
					System.out.println("==============================================");
					break;
				case 2:
					userDetails();
					System.out.println("==============================================");
					System.out.println("Ticket Price Rs."+amount);
					System.out.println("==============================================");
					break;
				case 3:
					System.exit(0);	
			}
		}
		else {
			System.out.println("You can select upto 5 seats only");
			System.out.println("----------------------------------------------");
			return ;
		}		
	}
	
	void firstClass() {
		System.out.println("First Class has 16 Seats in a Row");
		System.out.println("First Class Seats From A1 - G16");
		System.out.println("Enter No of Seats upto 10");
		int noOfSeats = input.nextInt();
		if(noOfSeats<=10) {
			// The row name and number is getting from the user.
			//Two Dimensional Array is used.
		String[][] first_class_seat = new String [noOfSeats][noOfSeats]; 
		double amount = noOfSeats * 200;
		System.out.println("Select your seat row with number");
		for(int seatRow=0;seatRow<first_class_seat.length;seatRow++) {
			first_class_seat[seatRow][seatRow] = input.next();
			System.out.println(first_class_seat[seatRow][seatRow] );
		}
			System.out.println("Your Seats");
			System.out.println("========================");
			System.out.println("Seat No :");
			
		for(int seatRow=0;seatRow<first_class_seat.length;seatRow++) {
			System.out.print(first_class_seat[seatRow][seatRow]+" ");
		}
			System.out.println("\n"+"========================");
			System.out.println("\n"+"Foods and Beverages");
			System.out.println("1. Order"+"\n"+"2. Skip");
			int choice = input.nextInt();
			switch(choice){
				case 1:
					orderFoods();
					userDetails();
					getFoodBill();
					System.out.println("Ticket Price Rs."+amount);
					System.out.println("==============================================");
				
					break;
				case 2:
					userDetails();
					System.out.println("==============================================");
					System.out.println("Ticket Price Rs."+amount);
					System.out.println("==============================================");
					break;
				case 3:
					System.exit(0);	
			}
		}
		else {
			System.out.println("You can select upto 10 seats only");
			System.out.println("----------------------------------------------");
			return ;
		}
	}
	
	void secondClass() {
		System.out.println("Second Class has 12 Seats in a Row");
		System.out.println("Second Class Seats From H1 - S12");
		System.out.println("Enter No of Seats upto 10");
		int noOfSeats = input.nextInt();
		if(noOfSeats<=10) {
			//Two Dimensional Array is used.
		String[][] second_class_seat = new String [noOfSeats][noOfSeats]; 
		double amount = noOfSeats * 150;
		System.out.println("Select your seat row with number");
		for(int seatRow=0;seatRow<second_class_seat.length;seatRow++) {
			second_class_seat[seatRow][seatRow] = input.next();
			System.out.println(second_class_seat[seatRow][seatRow] );
		}
			System.out.println("Your Seats");
			System.out.println("========================");
			System.out.println("Seat No :");
			
		for(int seatRow=0;seatRow<second_class_seat.length;seatRow++) {
			System.out.print(second_class_seat[seatRow][seatRow]+" ");
		}
			System.out.println("\n"+"========================");
			System.out.println("\n"+"Foods and Beverages");
			System.out.println("1. Order"+"\n"+"2. Skip");
			int choice = input.nextInt();
			switch(choice){
				case 1:
					orderFoods();
					userDetails();
					getFoodBill();
					System.out.println("Ticket Price Rs."+amount);
					System.out.println("==============================================");
					break;
				case 2:
					userDetails();
					System.out.println("==============================================");
					System.out.println("Ticket Price Rs."+amount);
					System.out.println("==============================================");
					break;
				case 3:
					System.exit(0);	
			}
		}
		else {
			System.out.println("You can select upto 10 seats only");
			System.out.println("----------------------------------------------");
			return ;
		}
	}
	void thanksMessage() {
		//The bill has Date
		System.out.println(new Date());
		System.out.println("Enjoy Your Cinema");
		System.out.println("----------------------------------------------");
	}
}