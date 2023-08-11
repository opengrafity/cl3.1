package in.mahaan.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.mahaan.inventory.model.Product;

@Controller
@RequestMapping("/product")
public class ProductControllers {
	@RequestMapping("register")
	public String register(@ModelAttribute("product") Product product) {
		System.out.println(product);
		return "success";
	}
}
