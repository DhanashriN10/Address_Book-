package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

//import Address_book_assign.Contact;

public class Address_book_main {
	
	public static ArrayList<Contact> addressBook = new ArrayList<Contact>();
	static Scanner input = new Scanner(System.in);
	 
	 public static Contact getcontacts()
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
	        int zip=input.nextInt();

	        System.out.println();
	        System.out.println("contact created");
	        
	        System.out.println("*********Person details***********");
	        System.out.println(" ");
	        
	        System.out.println("FirstName: "+FirstName);
	        System.out.println("LastName: "+LastName);
	        System.out.println("PhoneNumber: "+mobile);
	        System.out.println("Email id: "+Email);
	        System.out.println("Address: "+Address);
	        System.out.println("City: "+City);
	        System.out.println("State: "+State);
	        System.out.println("Zip: "+zip);
	        
	        Contact contact = new Contact(FirstName, LastName, Address, City, State, zip, mobile, Email);
	        return contact;
	 }


	// Method to create an object of Contact class with user input

	    public static void addContact() {
	        addressBook.add(getcontacts());
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO ADDRESS BOOK");
		Address_book_main.getcontacts();
		Address_book_main.addContact();
		
	}
}
