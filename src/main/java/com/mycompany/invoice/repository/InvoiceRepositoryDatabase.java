package com.mycompany.invoice.repository;
import com.mycompany.invoice.entity.Invoice;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface{

    @Override
    public void create(Invoice invoice) {

        System.out.println("Invoice added with number " +invoice.getNumber()+" for "+invoice.getCustomerName());
    }
}
