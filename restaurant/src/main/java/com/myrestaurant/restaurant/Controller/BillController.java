package com.myrestaurant.restaurant.Controller;

import com.myrestaurant.restaurant.Repository.BillRepository;
import com.myrestaurant.restaurant.entity.Bills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api3")
public class BillController {

    private BillRepository billRepository;

    @Autowired
    public BillController(BillRepository theBillRepository){
        billRepository=theBillRepository;
    }
     @GetMapping("/bill")
    public List<Bills> findAll(){
        return billRepository.findAll();
     }


    @GetMapping("/bill/{customerId}")
    public Optional<Bills> getBill(@PathVariable int customerId){
        return billRepository.findById(customerId);
    }
}
