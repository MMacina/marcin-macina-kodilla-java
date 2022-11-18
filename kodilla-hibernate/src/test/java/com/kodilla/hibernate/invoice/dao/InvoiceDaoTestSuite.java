package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Marchewka");
        Product product2 = new Product("Kijek");
        Item item1 = new Item(new BigDecimal(150), 5, new BigDecimal(750));
        Item item2 = new Item(new BigDecimal(100), 3, new BigDecimal(300));
        Item item3 = new Item(new BigDecimal(100), 2, new BigDecimal(200));
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);
        Invoice invoice = new Invoice("xxyy/zz");







        //When




    }
}
