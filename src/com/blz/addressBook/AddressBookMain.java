package com.blz.addressBook;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book"); 
		AddressBook addressBook = new AddressBook();
		Scanner scanner = new Scanner(System.in); 
		int Number;

		/**
		 * Enter number 1 to add this contacts details 
		 * Enter number 2 to displaying
		 * contact details
		 */
		do {
			System.out.println(" 1. Add Contact \n 2. Display contact \n");
			System.out.println("Enter the  Number: ");

			Number = scanner.nextInt(); 
			switch (Number) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.showContacts();
				break;
			default:
				System.out.println(" !!!Invalid Input!!! ");
				break;

			}
		} while (Number != 3); 

	}

}
