package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }


    @Override
    public void createInvoice() {

        //Scanner scanner = new Scanner(System.in);
        String customerName = "Virgini Galactic";
        Invoice invoice = new  Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);
    }
}
