package com.mycompany.invoise.core.repository;
import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {


   /* public Invoice create(Invoice invoice);
    public List<Invoice> list();
    public Invoice getById(String number);
*/

}
