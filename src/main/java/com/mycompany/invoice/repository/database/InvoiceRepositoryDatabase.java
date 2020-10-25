package com.mycompany.invoice.repository.database;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Override
    public void create(Invoice invoice) {

        System.out.println("Invoice added with number " +invoice.getNumber()+" for "+invoice.getCustomerName());
    }
}
