package in.mahaan.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.mahaan.inventory.model.Product;
import in.mahaan.inventory.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductControllers {
	@Autowired
	private ProductService prodService;
	@RequestMapping("register")
	public String register(@ModelAttribute("product") Product product) {
		boolean status = prodService.saveProduct(product);
		if(status) {
			return "success";
		}
		return "fail";
	}
}
