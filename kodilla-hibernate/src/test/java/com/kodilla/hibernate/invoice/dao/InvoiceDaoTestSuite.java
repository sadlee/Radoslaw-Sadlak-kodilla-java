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
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("012/12/2019");

        Product milk = new Product("milk");
        Product nachos = new Product("nachos");
        Product bread = new Product("bread");

        Item itemMilk = new Item(milk, new BigDecimal(5, 4);
        Item itemNachos = new Item(nachos, new BigDecimal(8), 1);
        Item itemBread = new Item(bread, new BigDecimal(3), 1);

        itemMilk.setInvoice(invoice);
        itemNachos.setInvoice(invoice);
        itemBread.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemMilk);
        items.add(itemNachos);
        items.add(itemBread);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceReadFromDB.getId());
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, invoiceReadFromDB.getItems().size());
    }
}