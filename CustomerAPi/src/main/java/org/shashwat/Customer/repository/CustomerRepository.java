package org.shashwat.Customer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.shashwat.Customer.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	Optional<Customer> findByCustomerName(String customerName);
	Optional<Customer> findByCustomerNameAndCustomerAddress(String customerName,String customerAddress);
	Customer findByCustomerNameOrCustomerAddress(String customerName,String customerAddress);
	List<Customer> findByDateOfBirth(String dateOfBirth);
}
