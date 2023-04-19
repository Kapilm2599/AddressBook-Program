package com.blz.addressBook;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book"); 
		AddressBook addressBook = new AddressBook();
		Scanner scanner = new Scanner(System.in); 
		int Number;

		do {
			System.out.println(" 1. Add Contact \n 2. Display contact \n 3. Edit contact");
			System.out.println("Enter the  Number: ");

			Number = scanner.nextInt(); 
			switch (Number) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.showContacts();
				break;
			case 3:
				addressBook.editContact();
				break;
			default:
				System.out.println(" !!!Invalid Input!!! ");
				break;

			}
		} while (Number < 4); 

	}

}
