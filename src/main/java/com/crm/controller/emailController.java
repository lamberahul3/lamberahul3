package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.utilities.*;

@Controller
public class emailController {
	
	@Autowired
	private emailService emailService;
	
	
	@RequestMapping("/sendEmail")
	public String showEmailPage(@RequestParam("email")String email, ModelMap model) {
		//System.out.println(email);
		model.addAttribute("to", email);
		return "composemail";
	}
	@RequestMapping("/send")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub, @RequestParam("message") String message, ModelMap model ) {
		emailService.sendSimpleMessage(to, sub, message);
		model.addAttribute("msg", "E-mail Sent!!") ;
		return "composemail";
	}
}
