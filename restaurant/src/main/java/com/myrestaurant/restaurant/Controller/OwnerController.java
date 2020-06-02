package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Repository.OwnerRepository;
import com.myrestaurant.restaurant.entity.Bills;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Date;
import java.util.List;

@RestController
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
}
