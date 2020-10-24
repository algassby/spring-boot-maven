package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public class InvoiceServiceNumber implements InvoiceServiceInterface{
    private static  long lasNumber = 0L;
    private InvoiceRepositoryInterface invoiceRepository;

    public static long getLasNumber() {
        return lasNumber;
    }

    public static void setLasNumber(long lasNumber) {
        InvoiceServiceNumber.lasNumber = lasNumber;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public void create(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lasNumber));
        invoiceRepository.create(invoice);
    }
}
