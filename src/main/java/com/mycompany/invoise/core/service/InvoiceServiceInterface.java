package com.mycompany.invoise.core.service;
import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Service;


public interface InvoiceServiceInterface {
    public Invoice create(Invoice invoice);
    public Invoice getInvoiceById(String number);
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    public Iterable<Invoice> getInvoiceList();
}
