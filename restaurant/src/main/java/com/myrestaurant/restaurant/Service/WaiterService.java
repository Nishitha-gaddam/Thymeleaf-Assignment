package com.myrestaurant.restaurant.Service;

import com.myrestaurant.restaurant.entity.Orders;

import java.util.List;

public interface WaiterService {
    public List<Orders> findAll();

    public List<String> findOrders();
}