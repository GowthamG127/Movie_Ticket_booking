package com.ticket.movie;

import java.util.Scanner;

public class Foods {

	Scanner input = new Scanner(System.in);
	double amount= 0.000;
	double temp=0.000;
	int quantity,option;
	void orderFoods() {
		System.out.println("Order Your Foods");
		System.out.println("1. Pizza"+"\n"+"2. Popcorns"+"\n"+"3. Cold Drinks"+"\n"+"4. Burger"+"\n"+"5. Water Bottle"+"\n"+"6. Return to Payment");
		int order = input.nextInt();
		switch(order) {
		case 1:
			pizza();
			System.out.println("1. Add More"+"\n"+"2. Proceed to payment");
			option = input.nextInt();
			if(option==1) {
				orderFoods();
				temp+=amount;
			}
			else{
				System.out.println("==============================================");
				System.out.println("Total Amount for Food and Beverages Rs."+temp);
				System.out.println("==============================================");
			}
			break;
		case 2:
			popcorn();
			System.out.println("1. Add More"+"\n"+"2. Proceed to payment");
			option = input.nextInt();
			if(option==1) {
				orderFoods();
				temp+=amount;
			}
			else{
				System.out.println("==============================================");
				System.out.println("Total Amount for Food and Beverages Rs."+temp);
				System.out.println("==============================================");
			}
			break;
		}
	}
	void pizza() {
		System.out.println("Select No oF Pizza");
		quantity = input.nextInt();
		amount = quantity * 200;
		temp += amount;
	}
	void popcorn() {
		System.out.println("Select No oF Popcorn");
		quantity = input.nextInt();
		amount = quantity * 120;
		temp +=amount;
	}
}
