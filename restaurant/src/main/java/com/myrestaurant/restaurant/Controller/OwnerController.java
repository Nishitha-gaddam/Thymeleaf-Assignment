package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Repository.OwnerRepository;
import com.myrestaurant.restaurant.entity.Bills;
import com.myrestaurant.restaurant.entity.Orders;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api6")
public class OwnerController {
    private OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository theOwnerRepository){
        ownerRepository=theOwnerRepository;
    }

    @GetMapping("/bill")
    public List<Bills> getAlllBills(){
        return ownerRepository.findAll();
    }

    @GetMapping("/bill/{fromDate}/{toDate}")
    public List<Bills> getBills(@PathVariable Date fromDate, @PathVariable Date toDate){
        return ownerRepository.generateBill(fromDate,toDate);
    }
    @GetMapping("/bill/{date}")
    public List<Bills> getBillsByDay(@PathVariable Date date){
        return ownerRepository.getBillsByDay(date);

    }
    
    @GetMapping("/loginForm")
    public String login() {
    	return "owner-login";
    }
    
    
    
    @GetMapping("/findbills")
    public String getAllOrders(Model theModel,HttpServletRequest httpServletRequest) {
    	List<Bills>billList=ownerRepository.findAll();
    	
    	theModel.addAttribute("ordersPlaced", billList);
    	
    	return "list-bills";
    }
   }
    

