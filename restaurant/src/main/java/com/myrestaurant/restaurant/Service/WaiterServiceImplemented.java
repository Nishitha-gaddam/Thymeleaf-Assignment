package com.myrestaurant.restaurant.Service;

import com.myrestaurant.restaurant.Repository.WaiterRepository;
import com.myrestaurant.restaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WaiterServiceImplemented implements WaiterService{

    private WaiterRepository waiterRepo;
    @Autowired
    public WaiterServiceImplemented(WaiterRepository theWaiterRepo) {
        waiterRepo = theWaiterRepo;
    }

    @Override
    public List<String> findOrders() {
        return waiterRepo.findOrders();
    }

    @Override
    public List<Orders> findAll() {
        return waiterRepo.findAll();
    }
}
