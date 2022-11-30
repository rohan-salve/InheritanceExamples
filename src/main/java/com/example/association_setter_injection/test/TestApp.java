package com.example.association_setter_injection.test;

import com.example.association_setter_injection.entities.Account;
import com.example.association_setter_injection.entities.Employee;


public class TestApp {

	public static void main(String[] args) {

		// Creating an Dependent object
		Account account = new Account();

		// performing setter injection to inject the values
		account.setAccName("ROHAN");
		account.setAccNo("KKBK001");
		account.setAccType("SAVING");

		// Create a Target object and inject the dependent object in the constructor
		Employee employee = new Employee();
		employee.setEid(58);
		employee.setEname("ROHAN");
		employee.setEaddress("salvergs9@gmail.com");

		// Performing Setter injection to account
		employee.setAccount(account);

		// checking the data of employee to see whether injection happened or not
		employee.display();

	}

}
