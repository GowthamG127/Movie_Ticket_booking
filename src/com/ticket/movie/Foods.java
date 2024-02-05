package com.ticket.movie;

import java.util.Scanner;

public class Foods extends UserInformation {
	Scanner input = new Scanner(System.in);
	 double temp;
	 int quantity,quantity1,option;
	double amount =0;
	private int foodItems() {
		System.out.println("Order Your Foods");
		System.out.println("1. Pizza"+"\n"+"2. Popcorns"+"\n"+"3. Cold Drinks"+"\n"+"4. Burger"+"\n"+"5. Water Bottle");
		return input.nextInt();
	}
	
	boolean orderFoods() {
		int order;
		int option =0;
		do {
			//returned value is assigned to order
			order =foodItems();
			switch(order) {
			case 1:
				//calls individual foodItems
				pizza();
				break;
			case 2:
				popcorn();
				break;
			case 3:
				coldDrinks();
				break;
			case 4:
				burger();
				break;
			case 5:
				waterBottle();
				break;
			default:
				System.out.println("Invalid Option");
				continue;
				
		}
			//Adding more items or move to payment section
			System.out.println("1. Add More"+"\n"+"2. Proceed to payment");
			option = input.nextInt();
		}	while(option==1);
			return option==2;
		
	}
	void pizza() {
		System.out.println("Select No of Pizza");
		quantity = input.nextInt();
		temp = quantity * 200;
		amount += temp;
	}
	void popcorn() {
		System.out.println("Select No of Popcorn");
		quantity= input.nextInt();
		temp = quantity* 120;
		amount +=temp;
	}
	void coldDrinks() {
		System.out.println("Select No of Cold Drinks");
		quantity = input.nextInt();
		temp = quantity * 30;
		amount +=temp;
	}
	void burger() {
		System.out.println("Select No of Burger");
		quantity = input.nextInt();
		temp = quantity * 105;
		amount +=temp;
	}
	void waterBottle() {
		System.out.println("Select No of Water Bottles");
		quantity = input.nextInt();
		temp = quantity * 20;
		amount +=temp;
	}
	
	// the value of food_bill should be accessed to it's sub class,so getters is used. 
	public double getFoodBill() {
		System.out.println("==============================================");
		System.out.println("Total Amount for Food and Beverages Rs."+amount);
		return amount;
	}
}
