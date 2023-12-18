package com.learn.java.services;

import com.learn.java.interfaces.SpellChecker;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("basicSpellChecker")
@Scope("singleton")
public class BasicSpellChecker implements SpellChecker {
    public void checkSpelling(String emailMessage){
        if (emailMessage != null){
            System.out.println("Spell Check Completed");
        }
        else{
            throw new RuntimeException("An exception occured");
        }
    }
}
