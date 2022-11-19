package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Product product1 = new Product("Carrot");
        Product product2 = new Product("Stick");
        productDao.save(product1);
        int pid1 = product1.getId();
        productDao.save(product2);
        int pid2 = product2.getId();

        Invoice invoice = new Invoice("INV/0001/2022");
        invoiceDao.save(invoice);
        int id = invoice.getId();

        Item item1 = new Item(new BigDecimal(150), 5, new BigDecimal(750));
        Item item2 = new Item(new BigDecimal(100), 3, new BigDecimal(300));
        Item item3 = new Item(new BigDecimal(100), 2, new BigDecimal(200));
        item1.setProduct(product1);
        item1.setInvoice(invoice);
        item2.setProduct(product2);
        item2.setInvoice(invoice);
        item3.setProduct(product2);
        item3.setInvoice(invoice);
        itemDao.save(item1);
        int iid1 = item1.getId();
        itemDao.save(item2);
        int iid2 = item2.getId();
        itemDao.save(item3);
        int iid3 = item3.getId();

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product2.getItems().add(item3);

        //When
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoiceDao.save(invoice);

        //Then
        List<Item> invoiceItems = invoice.getItems();
        assertEquals(3, invoiceItems.size());

        //CleanUp
        invoice.getItems().remove(item1);
        invoice.getItems().remove(item2);
        invoice.getItems().remove(item3);
        List<Item> expectedEmptyInvoice = invoice.getItems();
        assertEquals(0, expectedEmptyInvoice.size());
        invoiceDao.deleteById(id);

        product1.getItems().remove(item1);
        product2.getItems().remove(item2);
        product2.getItems().remove(item3);
        productDao.deleteById(pid1);
        productDao.deleteById(pid2);
        assertEquals(0, productDao.count());
        assertEquals(0, itemDao.count());
    }
}
