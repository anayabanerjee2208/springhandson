package com.learn.java.services;

import com.learn.java.interfaces.SpellChecker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("advancedSpellChecker")
public class AdvancedSpellChecker implements SpellChecker {
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Advance Spell Check Completed");
        } else {
            throw new RuntimeException("An exception occured");
        }
    }
}
