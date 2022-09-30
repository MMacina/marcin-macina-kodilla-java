package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.orderService.Product;
import com.kodilla.good.patterns.challenges.orderService.User;

public class OrderRequest {

    private final Customer customer;
    private final Supplier supplier;
    private final Item item;
    private final int quantity;

    public OrderRequest(Customer customer, Supplier supplier, Item item, int quantity) {
        this.customer = customer;
        this.supplier = supplier;
        this.item = item;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return  "[" + customer + "]\n" +
                "[" + item + "]\n" +
                "Quantity:[" + quantity + "]\n" ;
    }
}
