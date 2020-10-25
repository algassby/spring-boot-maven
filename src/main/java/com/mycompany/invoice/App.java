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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est le chemin de la classe Controller ?");

        String controllerClass  = scanner.nextLine();

        System.out.println("Quelle est le chemin de la classe service?");
        String serviceClass  = scanner.nextLine();

        System.out.println("Quelle est le chemin de la classe Repository?");
        String repositoryClass  = scanner.nextLine();

        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepository = null;

        try{
            invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

       /* switch(controllerType){
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
        */


        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoice();

    }
}
