package com.mycompany.invoise.core.service.number;

import com.mycompany.invoise.core.entity.Customer;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.CustomerRepositoryInterface;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {
    //@Value("124")
    //private   long lasNumber = 124L;
    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;
    @Autowired
    private CustomerRepositoryInterface customerRepositoryInterface;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
      // Iterable<Invoice> invoices =  invoiceRepository.findAll();
       //ceci permet d'iniatiliser le client de chaque facture
      // invoices.forEach(invoice -> invoice.getCustomer().getName());
       return invoiceRepository.findAll();
    }
    @Override
    public Invoice create(Invoice invoice) {
      customerRepositoryInterface.save(invoice.getCustomer());
        return   invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoiceById(String number) {
        return  invoiceRepository.findById(number).orElseThrow();
    }
}
