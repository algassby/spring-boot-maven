package com.mycompany.invoise.core.repository;
import com.mycompany.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    public void create(Invoice invoice);
    public List<Invoice> list();
    public Invoice getById(String number);


}
