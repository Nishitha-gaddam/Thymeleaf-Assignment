package com.myrestaurant.restaurant.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
public class Orders {

//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name = "customer")
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

    @Column(name="order_date")
    private Date orderDate;

    public Orders() {
    }

    public Orders(int customerId, int orderId, String itemName, int quantity, Double itemPrice, Date orderDate) {
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
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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
