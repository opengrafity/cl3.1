package com.amfibyn.bootdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping(value="/index",produces = MediaType.TEXT_HTML_VALUE)
	public String index() {
		return "welcome";
	}
}
