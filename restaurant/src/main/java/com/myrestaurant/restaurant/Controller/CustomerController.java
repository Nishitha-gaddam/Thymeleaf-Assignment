package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Repository.CustomerRepository;
import com.myrestaurant.restaurant.entity.Customer;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/api1")
public class CustomerController {
	private CustomerRepository customerRepository;

	public CustomerController(CustomerRepository theCustomerRepository) {
		customerRepository = theCustomerRepository;
	}

	@GetMapping("/customer")
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}

	@GetMapping("/login")
	public String customerLoginPage() {
		return "customer-login";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("customer") Customer theCustomer) {

		customerRepository.save(theCustomer);

		return "place-order";
	}

	@PostMapping("/place-order")
	public String placeOrder() {
		return null;
	}

}
