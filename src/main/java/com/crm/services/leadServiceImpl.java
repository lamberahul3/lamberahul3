package com.crm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.lead;
import com.crm.repository.leadRepository;

@Service
public class leadServiceImpl implements leadService {

	@Autowired
	private leadRepository leadRepo;
	
	@Override
	public void saveLead(lead lead) {
		
		leadRepo.save(lead);
	}

	@Override
	public List<lead> getAllLeads() {
		List<lead> leads = leadRepo.findAll();
		return leads;
	}

	public lead getLeadById(long id) {
		Optional<lead> findById = leadRepo.findById(id);
		lead lead = findById.get();
		return lead;
	}

	@Override
	public lead findById(long id) {
		Optional<lead> findById = leadRepo.findById(id);
		lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
	}

}
