package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product();
        product1.setName("Product 1");
        Product product2 = new Product();
        product2.setName("Product 2");

        Item item1 = new Item();
        item1.setPrice(BigDecimal.valueOf(10.0));
        item1.setProduct(product1);
        item1.setQuantity(1);
        item1.setValue(item1.getPrice().multiply(BigDecimal.valueOf(item1.getQuantity())));

        Item item2 = new Item();
        item2.setPrice(BigDecimal.valueOf(20.0));
        item2.setProduct(product2);
        item2.setQuantity(2);
        item2.setValue(item2.getPrice().multiply(BigDecimal.valueOf(item2.getQuantity())));


        Invoice invoice = new Invoice();
        invoice.setNumber("12345");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        List<Item> items = itemDao.findAllByInvoice(invoice);

        //Then
//        System.out.println("Invoice ID " + id);
//        System.out.println("Items" + items.get(0).getInvoice());

        assertNotEquals(0, id);
        assertNotEquals(0, items.get(0).getInvoice());
        assertNotEquals(0, items.get(0).getProduct());
        assertNotEquals(0, items.get(1).getInvoice());
        assertNotEquals(0, items.get(1).getProduct());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
