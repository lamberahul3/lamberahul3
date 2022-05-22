package com.crm.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crm.entities.contact;
import com.crm.repository.contactRepository;
@Service
public class contactServiceImpl implements contactService {

	@Autowired
	private contactRepository contactRepo;
	

	@Override
	public void saveContact(contact contact) {
		contactRepo.save(contact);
	}


	@Override
	public List<contact> getAllLeads() {
		List<contact> contacts = contactRepo.findAll();
		return contacts;
	}


	@Override
	public contact getContactById(long id) {
		Optional<contact> findById = contactRepo.findById(id);
		contact contact = findById.get();
		return contact;
	}
}
