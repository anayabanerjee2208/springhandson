package com.learn.java.services;

import com.learn.java.interfaces.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.lang.model.element.Name;

@Component
public class EmailClient {

    @Autowired
    @Qualifier("advancedSpellChecker")
    private SpellChecker spellChecker;

    /*public EmailClient(SpellChecker _spellChecker){
        this.basicSpellChecker = _spellChecker;
    }*/
    public void SendMail(String emailMessage){
        spellChecker.checkSpelling(emailMessage);
    }
}
