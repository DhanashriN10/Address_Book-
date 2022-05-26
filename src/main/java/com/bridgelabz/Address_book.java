package com.bridgelabz;

import java.util.Scanner;

public class Address_book 
{
	public static void main(String[] args) {
        System.out.println(" Welcome to the Address Book Program");

        Scanner scanner = new Scanner(System.in);
        Address_book_main addBook = new Address_book_main();

        String ch;
        while (true) {
            System.out.println(" **** MENU ****");
            System.out.println(" 1. Add contacts\n 2. Display contacts\n 3. Edit contacts\n 4. Exit");
            System.out.print("\n Please enter your choice: ");

            ch = scanner.next();

            switch (ch) {
                case "1":
                    addBook.getcontacts();
                    break;
                case "2":
                    addBook.displayContacts();
                    break;
                case "3":
                    addBook.editContact();
                    break;
                case "4":
                    System.out.println(" Exit");
                    return;
                default:
                    System.out.println(" Please enter a valid choice: ");
            }
        }
    }


}
