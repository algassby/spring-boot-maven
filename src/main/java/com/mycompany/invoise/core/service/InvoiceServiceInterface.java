package com.mycompany.invoise.core.service;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.Optional;

public interface InvoiceServiceInterface {
    public Invoice create(Invoice invoice);
    public Invoice getInvoiceById(String number);
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    public Iterable<Invoice> getInvoiceList();
}
