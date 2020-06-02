package com.myrestaurant.restaurant.Repository;

import com.myrestaurant.restaurant.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
