package in.mahaan.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahaan.inventory.model.Product;

@Controller
public class ViewController {
	@RequestMapping("/index")		
	public String index() {
		return "index";
	}
	@RequestMapping("/welcome")		
	public String welcome() {
		return "index";
	}
	@RequestMapping("/register")		
	public ModelAndView register() {
		Product product = new Product();
		ModelAndView prodRegisterView = new ModelAndView("register");
		prodRegisterView.addObject("product", product);
		return prodRegisterView;
	}
	
}
