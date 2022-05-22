package com.crm.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.entities.lead;
import com.crm.repository.*;
@RestController
public class leadRestController {

	@Autowired
	private leadRepository leadRepo;
	
	@RequestMapping("/lead/{id}")
	public lead getLead(@PathVariable long id) {
			Optional<lead> findById = leadRepo.findById(id);
			lead lead = findById.get();
			return lead;
	}
}
