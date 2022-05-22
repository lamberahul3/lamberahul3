package com.crm.services;

import java.util.List;

import com.crm.entities.lead;

public interface leadService {
	public void saveLead(lead lead);

	public List<lead> getAllLeads();

	public lead getLeadById(long id);

	public lead findById(long id);

	public void deleteLeadById(long id);
}
