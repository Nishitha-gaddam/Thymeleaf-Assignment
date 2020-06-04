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
@RequestMapping(BillController.bill1)
public class BillController {
	
	final  static  String bill1="/bills";

     private BillRepository billRepository;

    @Autowired
    public BillController(BillRepository theBillRepository){
        billRepository=theBillRepository;
    }
     @GetMapping("/findbill")
    public List<Bills> findAll(){
        return billRepository.findAll();
     }


    @GetMapping("/bills/{customerId}")
    public Optional<Bills> getBill(@PathVariable int customerId){
        return billRepository.findById(customerId);
    }
}
