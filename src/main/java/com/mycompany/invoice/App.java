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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //on recupere le fichier de congiuration de spring dans la classpath de l'application
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //on peut utiliser son id aussi
        //on instancie la classe avec le polymorphisme qui es une interface
       InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();

    }
}
