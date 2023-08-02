package dev.grafity.springmvc;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dev.grafity.springmvc.model.User;

@Controller
public class RegisterController {
	@RequestMapping("/register")

	public String register(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "success";
	}
	 
	/*
	 * public String register(@RequestParam("username") String username) {
	 * System.out.println(username); return "success"; }
	 */
	@RequestMapping("/registerform")
	public ModelAndView registerForm() {	
		ModelAndView mv = new ModelAndView("registration");
		User user = new User();
		user.setUsername("Amfibyn");
		mv.addObject("user", user);
		return mv;
	} 

}
