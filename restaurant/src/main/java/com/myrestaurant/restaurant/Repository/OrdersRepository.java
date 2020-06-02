package com.myrestaurant.restaurant.Repository;


import com.myrestaurant.restaurant.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository  extends JpaRepository<Orders,Integer> {

}
