package com.mycompany.invoice.controller.keyboard;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        //Scanner scanner = new Scanner(System.in);
        String customerName = "SpaceX";
        Invoice invoice = new  Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);

    }
}
