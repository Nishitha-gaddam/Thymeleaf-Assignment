package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Service.WaiterService;
import com.myrestaurant.restaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WaiterController {

    private WaiterService waiterService;

    @Autowired
    public WaiterController(WaiterService theWaiterService) {
        waiterService = theWaiterService;
    }

    @GetMapping("/order")
    public List<Orders> findAll() {
        return waiterService.findAll();
    }

    @GetMapping("/orders")
    public List<String> findAllOrders(){
        return waiterService.findOrders();
    }
}
