package com.example.association_constructor.one2one.test;


import com.example.association_constructor.one2one.entities.Account;
import com.example.association_constructor.one2one.entities.Employee;

public class TestApp {

	public static void main(String[] args) {

		// Creating an Dependent object through constructor
		Account account = new Account("KKBK001", "SAVINGS", "ROHAN");

		// Create a Target object and inject the dependent object in the constructor
		Employee employee = new Employee(58, "ROHAN", "salvergs9@gmail.com", account);

		// checking the data of employee to see whether injection happened or not
		employee.display();

	}

}
