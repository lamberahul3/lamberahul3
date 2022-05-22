package com.crm.services;


import java.util.List;

import com.crm.entities.contact;

public interface contactService {
	public void saveContact (contact contact);

	public List<contact> getAllLeads();

	public contact getContactById(long id);
}
