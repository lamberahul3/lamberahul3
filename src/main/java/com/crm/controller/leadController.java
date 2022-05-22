package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.lead;
import com.crm.services.leadService;

@Controller
public class leadController {
	
	@Autowired
	private leadService leadService;
	
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		return "saveLead";
	}

	@RequestMapping("/savelead")
	public String saveLead(lead lead, ModelMap model) {
		try {
			leadService.saveLead(lead);
			model.addAttribute("lead", lead);
			return "leadInfo";
		} catch (Exception e) {
			System.out.println("duplicate email id and mobile");
			System.out.println(e);
		}
		return"leadInfo";
//		if(lead!=null) {
//			return"leadInfo";
//		}else {
//			System.out.println("duplicate email");
//		}
//		return"";
	}
	@RequestMapping("/listall")
	public String listlead(ModelMap model) {
		List<lead> allLeads = leadService.getAllLeads();
		model.addAttribute("leads", allLeads);
		return"leadsResults";
	}
	@RequestMapping("getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}
}
