package com.myrestaurant.restaurant.Repository;

import com.myrestaurant.restaurant.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface WaiterRepository extends JpaRepository<Orders,Integer> {
    @Query("select orderId,itemName from Orders")
    public List<String> findOrders();

}
