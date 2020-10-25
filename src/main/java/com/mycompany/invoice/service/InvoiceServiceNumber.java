package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;

public class InvoiceServiceNumber implements InvoiceServiceInterface{
    @Value("124")
    private   long lasNumber = 124L;
    private InvoiceRepositoryInterface invoiceRepository;

    public long getLasNumber() {
        return lasNumber;
    }

    public void setLasNumber(long lasNumber) {
        this.lasNumber = lasNumber;
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
