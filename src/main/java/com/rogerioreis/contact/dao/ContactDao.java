package com.rogerioreis.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.contact.entity.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact, Integer> {

}
