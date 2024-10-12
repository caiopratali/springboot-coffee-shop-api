package br.com.pratali.coffee_shop.entity;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_date")
    private LocalTime orderDate;

    @ManyToMany
    private Set<Product> products;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public LocalTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalTime orderDate) {
        this.orderDate = orderDate;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
