package com.learn.java.services;

import com.learn.java.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
public static void main (String args[]){
    //EmailClient emailClient = new EmailClient(new BasicSpellChecker());
    //
   // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
   EmailClient emailClient= applicationContext.getBean("emailClient", EmailClient.class);
    emailClient.SendMail("My first email message");
    }
}
