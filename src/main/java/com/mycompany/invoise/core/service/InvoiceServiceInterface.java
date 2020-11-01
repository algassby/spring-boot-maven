package com.mycompany.invoise.core.service;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    public void create(Invoice invoice);
    public Invoice getInvoiceById(String number);
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    public List<Invoice> getInvoiceList();
}
