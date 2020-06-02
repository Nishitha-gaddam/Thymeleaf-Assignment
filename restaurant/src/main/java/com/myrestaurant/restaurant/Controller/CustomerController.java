package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Repository.CustomerRepository;
import com.myrestaurant.restaurant.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api1")
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository theCustomerRepository){
        customerRepository=theCustomerRepository;
    }

    @GetMapping("/customer")
    public List<Customer> findAll(){
        return customerRepository.findAll();


    }
}
