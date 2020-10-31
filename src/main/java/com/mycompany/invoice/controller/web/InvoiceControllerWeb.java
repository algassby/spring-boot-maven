package com.mycompany.invoice.controller.web;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.database.InvoiceRepositoryDatabase;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.prefix.InvoiceServicePrefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

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
            Invoice invoice = new  Invoice();
            invoice.setCustomerName("Tesla");
            invoiceService.create(invoice);
    }

    @RequestMapping("/invoice-home")
    public String displayHome (HttpServletRequest request){
        System.out.println("le controleur à été invoqué par la methode displayHomes");
        List<Invoice> invoices = invoiceService.getInvoiceList();
        request.setAttribute("invoices", invoices);
        return "index";
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
        invoiceService.setInvoiceRepository(new InvoiceRepositoryDatabase());
        invoiceController.setInvoiceService(invoiceService);
        invoiceController.createInvoice();
        System.out.println(invoiceController.toString());
    }
}
