package com.blz.addressBook;

import java.util.Scanner;

public class AddressBook {
	
	Scanner scanner = new Scanner(System.in);

	ContactPerson contact = new ContactPerson(); 

	public void addContact() {
		System.out.println("Enter your FirstName: ");
		contact.setFirstName(scanner.next());
		System.out.println("Enter your LastName: ");
		contact.setLastName(scanner.next());
		System.out.println("Enter your Email: ");
		contact.setEmail(scanner.next());
		System.out.println("Enter your Address: ");
		contact.setAddress(scanner.next());
		System.out.println("Enter your City: ");
		contact.setCity(scanner.next());
		System.out.println("Enter your State: ");
		contact.setState(scanner.next());
		System.out.println("Enter your Zipcode: ");
		contact.setZip(scanner.nextInt());
		System.out.println("Enter your Mobile Number: ");
		contact.setMobile(scanner.nextLong());
	}

	public void showContacts() {
		System.out.println(contact.toString());
	}

}
