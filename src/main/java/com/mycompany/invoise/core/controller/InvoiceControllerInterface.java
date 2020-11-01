package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    public  void createInvoice();

    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
