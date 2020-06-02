package com.myrestaurant.restaurant.Repository;

import com.myrestaurant.restaurant.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.sql.Date;
import java.util.List;

public interface OwnerRepository extends JpaRepository<Bills,Integer> {

    @Query(value = "select bill_id,customer_id,total_amount,bill_date from bill where bill_date between ?1 and ?2",nativeQuery = true)
    List<Bills> generateBill(Date fromdate, Date toDate);



    @Query(value ="select * from bill where bill_date=?1",nativeQuery = true)
    public List<Bills> getBillsByDay(Date date);
}
