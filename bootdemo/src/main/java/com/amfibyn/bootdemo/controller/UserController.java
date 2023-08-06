package com.amfibyn.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amfibyn.bootdemo.model.UserModel;

@Controller
public class UserController {
	@PostMapping("/storeuser")	
	public String storeUser(@ModelAttribute("user") UserModel user) {
		System.out.println(user);
		return "successstoreuser";
	} 
	
}
