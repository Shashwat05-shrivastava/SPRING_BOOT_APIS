package org.shashwat.Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.shashwat.Customer.entities.Customer;
import org.shashwat.Customer.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<?> insertCustomer(@RequestBody Customer customer){
		customerService.insertCustomer(customer);
		return new ResponseEntity<String>("Inserted successfully",HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> getCustomer(){
		List<Customer> customers=customerService.getCustomer();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@DeleteMapping("/{cid}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("cid") int cid){
		customerService.deleteCustomer(cid);
		return new ResponseEntity<String>("deleted Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/update/{cid}")
	public ResponseEntity<?> updateCustomer(@PathVariable("cid") int cid,@RequestBody Customer customer){
		customerService.updateCustomer(cid, customer);
		return new ResponseEntity<String>("updated Successfully",HttpStatus.CREATED);
	}
}
