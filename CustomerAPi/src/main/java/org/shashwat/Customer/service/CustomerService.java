package org.shashwat.Customer.service;

import java.util.List;
import org.shashwat.Customer.entities.Customer;

public interface CustomerService {
	
	void insertCustomer(Customer customer);
	List<Customer> getCustomer();
	void deleteCustomer(int cid);
	Customer getCustomer(int cid);
	void updateCustomer(int cid,Customer customer);
	
}
