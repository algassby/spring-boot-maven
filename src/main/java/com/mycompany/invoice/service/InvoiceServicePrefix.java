package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface{
    private static  long lasNumber = 112L;
    private InvoiceRepositoryInterface invoiceRepository;

    public static long getLasNumber() {
        return lasNumber;
    }

    public static void setLasNumber(long lasNumber) {
        InvoiceServicePrefix.lasNumber = lasNumber;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public void create(Invoice invoice) {
        invoice.setNumber(String.valueOf("IN_"+(++lasNumber)));
        invoiceRepository.create(invoice);
    }

    @Override
    public String toString() {
        return "InvoiceServicePrefix{" +
                "invoiceRepository=" + invoiceRepository +
                '}';
    }

    public static void main(String []args){
        InvoiceServiceInterface invoiceService = new InvoiceServicePrefix();
        invoiceService.setInvoiceRepository(new InvoiceRepositoryDatabase());
        invoiceService.create(new Invoice());
        System.out.println(invoiceService.toString());
    }
}
