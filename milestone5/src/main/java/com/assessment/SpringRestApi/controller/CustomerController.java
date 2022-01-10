package com.assessment.SpringRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.SpringRestApi.model.Customer;
import com.assessment.SpringRestApi.repository.CustomerRepository;

@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerRepo.findAll();
	}
	
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepo.save(customer);
	}
}
