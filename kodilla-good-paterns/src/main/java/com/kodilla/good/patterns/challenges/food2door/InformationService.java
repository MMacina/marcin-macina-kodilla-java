package com.kodilla.good.patterns.challenges.food2door;

public interface InformationService {
    void sendOrderInquiryToSupplier(OrderRequest orderRequest);

    void confirmOrderToCustomer(OrderRequest orderRequest);
    void rejectOrderToCustomer(OrderRequest orderRequest);
}
