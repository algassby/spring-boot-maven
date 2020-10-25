package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.prefix.InvoiceServicePrefix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {
        //on recupere le fichier de congiuration de spring dans la classpath de l'application
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class);
        //on peut utiliser son id aussi
        //on instancie la classe avec le polymorphisme qui es une interface
       InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();

    }

   /* @Bean
    public InvoiceServiceInterface configueInvoiceService(){
        return new InvoiceServicePrefix();
    }*/
}
