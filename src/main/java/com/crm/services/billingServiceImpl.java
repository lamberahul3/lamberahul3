package com.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.billing;
import com.crm.repository.billingRepository;

@Service
public class billingServiceImpl implements billingService {

	@Autowired
	private billingRepository billRepo;
	
	@Override
	public String saveBill(billing bill) {
		billRepo.save(bill);
		return"";
	}

}
