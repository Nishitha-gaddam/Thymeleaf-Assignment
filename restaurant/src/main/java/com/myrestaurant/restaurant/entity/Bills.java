package com.myrestaurant.restaurant.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "bill")
public class Bills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private int billId;

    @Column(name="order_id")
    private int orderId;

    @Column(name = "total_amount")
    private double totalAmt;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(name = "bill_date")
    private Date billDate;

    public Bills() {
    }

    public Bills(int billId, int orderId, double totalAmt, Date billDate) {
        this.billId = billId;
        this.orderId = orderId;
        this.totalAmt = totalAmt;
        this.billDate = billDate;
    }

    public int getorderId() {
        return orderId;
    }

    public void setorderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date orderDate) {
        this.billDate = orderDate;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Override
    public String toString() {
        return "Bills{" +
                "billId=" + billId +
                "orderId=" + orderId +
                ", totalAmt=" + totalAmt +
                ", billDate=" + billDate +
                '}';
    }
}
