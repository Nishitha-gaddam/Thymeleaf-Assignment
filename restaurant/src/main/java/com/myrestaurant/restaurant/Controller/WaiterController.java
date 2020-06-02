package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Service.WaiterService;
import com.myrestaurant.restaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
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
    
    @GetMapping("/findorder")
    public String getAllOrders(Model theModel) {
    	List<Orders>orderList=waiterService.findAll();
    	
    	theModel.addAttribute("ordersPlaced", orderList);
    	
    	return "list-orders";
    	
    }
    
    @GetMapping("/login")
    public String showLoginPage() {
        return "waiter-login";
    }
}
