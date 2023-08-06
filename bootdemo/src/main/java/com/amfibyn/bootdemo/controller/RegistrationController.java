package com.amfibyn.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amfibyn.bootdemo.model.UserModel;

@Controller
public class RegistrationController {
	@GetMapping("/register")
	private ModelAndView regitrationpage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("registration");
		UserModel user = new UserModel();
				user.setMobileno("9966692356");
		mav.addObject("user",user );	
		return mav;
	}
}
