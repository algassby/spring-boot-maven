package com.mycompany.invoise.core.repository;
import com.mycompany.invoise.core.entity.invoice.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
//@Query("SELECT  invoice  from  Invoice invoice inner join fetch invoice.customer")
 //@EntityGraph(value = "invoise.customer", type = EntityGraph.EntityGraphType.FETCH)
 //Iterable<Invoice> findAll();
   /* public Invoice create(Invoice invoice);
    public List<Invoice> list();
    public Invoice getById(String number);
*/

}
