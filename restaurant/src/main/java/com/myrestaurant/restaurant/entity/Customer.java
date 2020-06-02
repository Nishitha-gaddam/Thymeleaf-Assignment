package com.myrestaurant.restaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name="mobile_number")
    private String mobileNumber;
    
    public Customer() {

    }

    public Customer(int customerId, String customerName,String mobileNumber ) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber=mobileNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getMobileNumber() {
    	return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
    	this.mobileNumber=mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ",mobileNumber="+mobileNumber+'\''+
                '}';
    }
}














