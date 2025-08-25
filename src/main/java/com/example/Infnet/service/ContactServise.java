package com.example.Infnet.service;


import com.example.Infnet.models.ContactModel;
import com.example.Infnet.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServise {

    private final ContactRepository repository;


    public ContactServise(ContactRepository repository) {
        this.repository = repository;
    }

    public ContactModel save(ContactModel contact){
        return repository.save(contact);
    }

    public List<ContactModel> listAll(){
        return repository.findAll();
    }
}
