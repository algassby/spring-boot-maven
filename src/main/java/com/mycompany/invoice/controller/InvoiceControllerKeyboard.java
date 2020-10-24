package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;

public class InvoiceControllerKeyboard implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        System.out.println( "what is the customer name?" );
        //Scanner scanner = new Scanner(System.in);
        String customerName = "SpaceX";
        Invoice invoice = new  Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);

    }
}
