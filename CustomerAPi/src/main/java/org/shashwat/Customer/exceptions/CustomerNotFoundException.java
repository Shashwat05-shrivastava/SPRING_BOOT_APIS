package org.shashwat.Customer.exceptions;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException(String  message) {
		super(message);
	}
}
