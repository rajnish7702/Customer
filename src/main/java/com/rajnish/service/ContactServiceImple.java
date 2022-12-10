package com.rajnish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajnish.model.Contact;
import com.rajnish.repositroy.ContactRepository;

@Service
public class ContactServiceImple implements ContactService {
	@Autowired
	private ContactRepository contactRepository;

	public String save(Contact contact) {
		
		contactRepository.save(contact);
		return "recored Sucessfully submited";
	}
	public List<Contact> show() {
		
		return contactRepository.findAll();
	}

	public Contact getContactById(Integer contactId) {
		
		return null;
	}

	
	public String update(Contact contact) {
		
		return null;
	}

	
	public String delete(Integer contactId) {
		contactRepository.delete(contactId);
		return "contact Delete sucessfully";
	}
	
}
