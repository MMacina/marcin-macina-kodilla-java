package com.kodilla.good.patterns.challenges.food2door;

import com.sun.source.tree.CaseLabelTree;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Marcin Macina", "m.mac@gmail.com", 505505505, "43-300 Bielsko-Biala");
        Supplier supplier = new ExtraFoodShop().createSupplier();
        Item item = new ExtraFoodShop().createSupplier().getItems().get(0);
        int quantity = 2;
        return new OrderRequest(customer, supplier, item, quantity);
    }
}
