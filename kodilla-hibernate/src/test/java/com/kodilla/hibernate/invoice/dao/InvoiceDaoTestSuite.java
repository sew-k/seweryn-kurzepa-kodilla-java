package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given

        Product product1 = new Product("Bread");
        Product product2 = new Product("Milk");
        Product product3 = new Product("Butter");
        Product product4 = new Product("Cheese");
        Item item1 = new Item(product1, new BigDecimal(3.59), 2);
        item1.setProduct(product1);
        Item item2 = new Item(product2, new BigDecimal(4.65), 1);
        item2.setProduct(product2);
        Item item3 = new Item(product3, new BigDecimal(1.15), 4);
        item3.setProduct(product3);
        Item item4 = new Item(product4, new BigDecimal(10.00), 1);
        item4.setProduct(product4);
        Invoice invoice = new Invoice("2023/03/04-001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
