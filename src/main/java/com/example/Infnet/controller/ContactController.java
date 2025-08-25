package com.example.Infnet.controller;

import com.example.Infnet.facade.ContactFacade;
import com.example.Infnet.models.ContactModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactFacade facade;


    public ContactController(ContactFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ContactModel create(@RequestBody ContactModel contact){
        return facade.createContact(contact);
    }

    @GetMapping
    public List<ContactModel> listAll(){
        return facade.listContacts();
    }

}
