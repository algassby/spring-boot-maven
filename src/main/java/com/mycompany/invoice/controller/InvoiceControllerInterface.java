package com.mycompany.invoice.controller;

import com.mycompany.invoice.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    public  void createInvoice();

    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
