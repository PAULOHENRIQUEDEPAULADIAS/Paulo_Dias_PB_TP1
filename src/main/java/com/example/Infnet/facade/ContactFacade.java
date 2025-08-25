package com.example.Infnet.facade;

import com.example.Infnet.models.ContactModel;
import com.example.Infnet.service.ContactServise;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactFacade {

    private final ContactServise servise;

    public ContactFacade(ContactServise servise) {
        this.servise = servise;
    }

    public ContactModel createContact(ContactModel contact){
        return servise.save(contact);
    }

    public List<ContactModel> listContacts(){
        return servise.listAll();
    }
}
