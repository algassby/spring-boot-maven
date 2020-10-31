package com.mycompany.invoice.repository;
import com.mycompany.invoice.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    public void create(Invoice invoice);
    public List<Invoice> list();


}
