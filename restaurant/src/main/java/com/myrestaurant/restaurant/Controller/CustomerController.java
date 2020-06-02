package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Repository.CustomerRepository;
import com.myrestaurant.restaurant.Repository.OrdersRepository;
import com.myrestaurant.restaurant.entity.Customer;
import com.myrestaurant.restaurant.entity.Orders;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.validation.Valid;

@Controller
@RequestMapping("/api1")
public class CustomerController {
	private CustomerRepository customerRepository;
	
//	private OrdersRepository ordersRepository;
//
//	   public CustomerController(OrdersRepository theOrdersRepository){
//	        ordersRepository =theOrdersRepository;
//	    }

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

//	@PostMapping("/save")
	@RequestMapping(value = "/save", method = {RequestMethod.GET})
	public String saveEmployee(@ModelAttribute("customer") Customer theCustomer) {

		customerRepository.save(theCustomer);

		return "redirect:/api2/place-order";
	}

	

}
