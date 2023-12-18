package com.learn.java.config;

import com.learn.java.services.AdvancedSpellChecker;
import com.learn.java.services.BasicSpellChecker;
import com.learn.java.services.EmailClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan (basePackages = "com.learn.java")
public class AppConfig {
//    @Bean(name="basicSpellChecker")
//    public BasicSpellChecker createBasicSpellChecker(){
//        return new BasicSpellChecker();
//    }
//    @Bean(name="advancedSpellChecker")
//    public AdvancedSpellChecker createBdvancedSpellChecker(){
//        return new AdvancedSpellChecker();
//    }
//    @Bean(name = "emailClient")
//    public EmailClient emailClient(){
//        EmailClient emailClient = new EmailClient();
//        emailClient.setBasicSpellChecker(createBasicSpellChecker());
//        return emailClient;
//    }
}
