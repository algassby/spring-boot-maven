package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String createInvoice(Invoice invoice){

        //Scanner scanner = new Scanner(System.in);
        String customerName = "SpaceX";
        invoice = new  Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.create(invoice);
        return null;

    }
}
