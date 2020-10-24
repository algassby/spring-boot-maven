package com.mycompany.invoice.service;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
    public void create(Invoice invoice);
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
