package com.kodilla.good.patterns.challenges.orderService;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Marcin Macina", "m.macina@gmail.com", 506602802, "43-300 Bielsko-Biala, Pieninska 58");
        Product product = new Product("Ecco Mx, size:41", "0001", 499.00);
        int quantity = 1;

        return new OrderRequest(user, product, quantity);
    }
}
