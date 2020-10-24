package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.controller.InvoiceControllerKeyboard;
import com.mycompany.invoice.controller.InvoiceControllerDouchette;
import com.mycompany.invoice.controller.InvoiceControllerWeb;
import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.repository.InvoiceRepositoryMemory;
import com.mycompany.invoice.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.InvoiceServiceNumber;
import com.mycompany.invoice.service.InvoiceServicePrefix;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "what is the customer name?" );
        System.out.println("Quel est le type de controller(keybord, web,douchette ?");

        Scanner scanner = new Scanner(System.in);
        String controllerType  = scanner.nextLine();

        System.out.println("Quel est le type de service(number, prefix ?");
        String serviceType  = scanner.nextLine();

        System.out.println("Quel est le type de repository(memory, database ?");
        String repositoryType  = scanner.nextLine();

        InvoiceControllerInterface invoiceController = null;
        switch(controllerType){
            case "keybord":
                invoiceController = new InvoiceControllerKeyboard();
            break;
            case "web":
                invoiceController = new InvoiceControllerWeb();
                break;
            case "douchette":
                invoiceController = new InvoiceControllerDouchette();

    }
        InvoiceServiceInterface invoiceService = null;
        switch (serviceType){
            case "number":
                invoiceService = new InvoiceServiceNumber();
                break;
            case "prefix":
                invoiceService = new InvoiceServicePrefix();
        }

        InvoiceRepositoryInterface invoiceRepository = null;
        switch (repositoryType){
            case "memory":
                invoiceRepository = new InvoiceRepositoryMemory();
                break;
            case "database":
                invoiceRepository = new InvoiceRepositoryDatabase();
        }

        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoice();

    }
}
