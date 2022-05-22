package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.crm.services.billingService;
import com.crm.entities.billing;

@Controller
public class billingController {
	
	@Autowired
	public billingService billingService;

	@RequestMapping("/generateBill")
	public String generateBill(billing bill) {
		billingService.saveBill(bill);
		return"listbill";
	}
}
