package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.InvoiceServicePrefix;

public class InvoiceControllerWeb implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoice() {

            System.out.println( "what is the customer name?" );
            //Scanner scanner = new Scanner(System.in);
            Invoice invoice = new  Invoice();
            invoice.setCustomerName("Tesla");
            invoiceService.create(invoice);
    }

    @Override
    public String toString() {
        return "InvoiceControllerWeb{" +
                "invoiceService=" + invoiceService +
                '}';
    }
    public static void main(String []args){
        InvoiceControllerInterface invoiceController = new InvoiceControllerWeb();
        InvoiceServiceInterface invoiceService = new InvoiceServicePrefix();
       // invoiceService.setInvoiceRepository(new InvoiceRepositoryDatabase());
        invoiceController.setInvoiceService(invoiceService);
        invoiceController.createInvoice();
        System.out.println(invoiceController.toString());
    }
}
