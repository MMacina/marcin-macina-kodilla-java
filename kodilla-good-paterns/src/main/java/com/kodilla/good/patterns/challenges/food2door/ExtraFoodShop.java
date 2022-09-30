package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop {
    public Supplier createSupplier() {
        String supplierName = "Extra Food Shop";
        String supplierEmail = "orders@efs.com";
        List<Item> items = new ArrayList<>();
        items.add(new Item("Ham", 14.99));
        items.add(new Item("Cheese", 19.85));

        return new Supplier(supplierName, supplierEmail, items);
    }
}
