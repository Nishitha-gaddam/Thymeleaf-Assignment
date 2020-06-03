package com.myrestaurant.restaurant.entity;


import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="orders")
public class Orders {

//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name = "customer")
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
    private int customerId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderId;

    @Column(name="item_name")
    private String itemName;

    @Column(name="quantity")
    private int quantity;

    @Column(name="item_price")
    private Double itemPrice;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(name="order_date")
    private String orderDate;

    public Orders() {
    }

    public Orders(int customerId, int orderId, String itemName, int quantity, Double itemPrice, String orderDate) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.orderDate = orderDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
        customerId=0;
        customerId++;
        
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
        itemPrice=100.00;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
        orderDate="2020-06-04";
    }

    @Override
    public String toString() {
        return "Orders{" +
                "customerId=" + customerId +
                ", orderId=" + orderId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", itemPrice=" + itemPrice +
                ", orderDate=" + orderDate +
                '}';
    }
}
