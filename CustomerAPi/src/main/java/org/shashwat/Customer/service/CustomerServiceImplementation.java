package org.shashwat.Customer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.shashwat.Customer.entities.Customer;
import org.shashwat.Customer.exceptions.CustomerNotFoundException;
import org.shashwat.Customer.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImplementation implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void insertCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int cid) {
		customerRepository.deleteById(cid);
	}

	@Override
	public Customer getCustomer(int cid) {
		return customerRepository.findById(cid).orElseThrow(()->new CustomerNotFoundException("Customer Not Found"));
	}

	@Override
	public void updateCustomer(int cid, Customer customer) {
		Customer customer2=customerRepository.findById(cid).orElseThrow(()->new CustomerNotFoundException("Customer Not Found"));
		customer2.setCustomerName(customer.getCustomerName());
		customer2.setCustomerAddress(customer.getCustomerAddress());
		customer2.setDateOfBirth(customer.getDateOfBirth());
		customerRepository.save(customer2);
	}

}
