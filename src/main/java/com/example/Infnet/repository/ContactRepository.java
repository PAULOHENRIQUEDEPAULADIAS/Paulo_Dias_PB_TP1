package com.example.Infnet.repository;

import com.example.Infnet.models.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactModel, Long> {
}
