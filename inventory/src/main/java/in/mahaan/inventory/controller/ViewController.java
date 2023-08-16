package in.mahaan.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahaan.inventory.model.Product;
import in.mahaan.inventory.service.ProductJdbcService;

@Controller
public class ViewController {
	@Autowired
	private ProductJdbcService prodService;
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
	@RequestMapping("/search")
	public ModelAndView search() {
		ModelAndView searchPage = new ModelAndView("search");		
		List<Product> products = prodService.getAllProducts();
		searchPage.addObject("allProducts",products);
		return searchPage;
	}
}
