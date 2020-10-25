package com.mycompany.invoice.service.prefix;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.database.InvoiceRepositoryDatabase;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {
    @Value("${invoice.lastNumber}")
    private   long lasNumber = 112L;
    @Value("${invoice.prefix}")
    private String prefix;


    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public long getLasNumber() {
        return lasNumber;
    }

    public void setLasNumber(long lasNumber) {
        this.lasNumber = lasNumber;
    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public void create(Invoice invoice) {
        invoice.setNumber(String.valueOf(prefix+(++lasNumber)));
        invoiceRepository.create(invoice);
    }

    @Override
    public String toString() {
        return "InvoiceServicePrefix{" +
                "invoiceRepository=" + invoiceRepository +
                '}';
    }

    public static void main(String []args){
        InvoiceServiceInterface invoiceService = new InvoiceServicePrefix();
        invoiceService.setInvoiceRepository(new InvoiceRepositoryDatabase());
        invoiceService.create(new Invoice());
        System.out.println(invoiceService.toString());
    }
}
