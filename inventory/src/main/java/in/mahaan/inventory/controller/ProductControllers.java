package in.mahaan.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("search")
	public ModelAndView search(@RequestParam("category") String searchCategory) {
		ModelAndView searchPage = new ModelAndView("search");
		List<Product> products= prodService.getProductsByCategory(searchCategory);		
		searchPage.addObject("allProducts",products);
		return searchPage;
	}
	
	
		
}
