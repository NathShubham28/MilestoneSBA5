package com.assessment.SpringRestApi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assessment.SpringRestApi.model.Customer;
import com.assessment.SpringRestApi.repository.CustomerRepository;

@SpringBootTest
class SpringRestApiApplicationTests {

	@Autowired
	CustomerRepository customerRepo;
	
	@Test
	public void testById() {
		Customer customer = customerRepo.findById(1).get();
		assertEquals("Veg",customer.getPreferredFood());
		
	}
	
	@Test
	public void testCreate() {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setAge(28);
		customer.setName("Mark");
		customer.setGender("male");
		customer.setPreferredFood("Non Veg");
		customerRepo.save(customer);
		assertNotNull(customerRepo.findById(8).get());
		
	}
	
	@Test
	public void testAll() {
		List<Customer> lst = customerRepo.findAll();
		assertTrue(lst.size() > 0);
		
	}

}
