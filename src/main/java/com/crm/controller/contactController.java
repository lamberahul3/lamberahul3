package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.contact;
import com.crm.entities.lead;
import com.crm.services.leadService;
import com.crm.services.contactService;


@Controller
public class contactController {
	
	@Autowired
	private leadService leadService;
	
	@Autowired
	private contactService contactService;
	
	@RequestMapping("/converToContact")
	public String converToContact(@RequestParam("id")long id, ModelMap model) {
		lead lead = leadService.findById(id);
		
		contact contact = new contact();
		
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setLeadsource(lead.getLeadsource());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
		leadService.deleteLeadById(id);
		List<contact> allContacts = contactService.getAllLeads();
		model.addAttribute("contacts", allContacts);
		return"contactsResults";
	}
	@RequestMapping("/viewContact")
	public String viewContact(ModelMap model) {
		List<contact> allContacts = contactService.getAllLeads();
		model.addAttribute("contacts", allContacts);
		return"contactsResults";
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id, ModelMap model) {
		contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"contactInfo";
	}
	
	@RequestMapping("/getIdForBilling")
	public String getIdForBilling(@RequestParam("id") long id, ModelMap model) {
		contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"billingInfo";
	}
}
 