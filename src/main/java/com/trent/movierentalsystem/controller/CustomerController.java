package com.trent.movierentalsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trent.movierentalsystem.entity.Customer;
import com.trent.movierentalsystem.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		customer.setId(id);
		return customerService.saveCustomer(customer);
	}

	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}
}
