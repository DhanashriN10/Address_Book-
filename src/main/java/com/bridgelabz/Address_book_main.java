package com.bridgelabz;

import java.util.Scanner;

public class Address_book_main {
	
	static Scanner input = new Scanner(System.in);
	 
	 public static void getcontacts()
	 {
	        
	        System.out.println("Enter person first name: ");
	        String FirstName=input.next();

	        System.out.println("Enter person last name: ");
	        String LastName=input.next();

	        System.out.println("Enter mobile number: ");
	        long mobile=input.nextLong();

	        System.out.println("Enter the Email id: ");
	        String Email=input.next();

	        System.out.println("Enter address: ");
	        String Address=input.next();

	        System.out.println("Enter city: ");
	        String City=input.next();

	        System.out.println("Enter State name: ");
	        String State=input.next();

	        System.out.println("Enter zip: ");
	        String zip=input.next();

	        System.out.println();
	        System.out.println("contact created");
	 }





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO ADDRESS BOOK");
		Address_book_main.getcontacts();
		
	}
}
