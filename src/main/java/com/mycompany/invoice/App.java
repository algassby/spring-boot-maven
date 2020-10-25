package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //on recupere le fichier de congiuration de spring dans la classpath de l'application
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //on peut utiliser son id aussi
        //on instancie la classe avec le polymorphisme qui es une interface
       InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();

    }
}
