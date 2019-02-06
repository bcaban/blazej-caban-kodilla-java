package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");

        Item item1 = new Item(new BigDecimal(250), 15, new BigDecimal(25));
        Item item2 = new Item(new BigDecimal(550), 35, new BigDecimal(45));
        Item item3 = new Item(new BigDecimal(50), 5, new BigDecimal(12));

        item1.setProduct(product1);

        item2.setProduct(product2);

        item3.setProduct(product3);

        Invoice invoice = new Invoice("2568");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();

        invoiceDao.save(invoice);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.delete(id);
            productDao.delete(product1Id);
            productDao.delete(product2Id);
            productDao.delete(product3Id);
        } catch (Exception e) {
            //do nothing
        }

    }
}
