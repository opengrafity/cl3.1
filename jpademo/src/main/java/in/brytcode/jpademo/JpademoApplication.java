package in.brytcode.jpademo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.brytcode.jpademo.entity.Aadhar;
import in.brytcode.jpademo.entity.Employee;
import in.brytcode.jpademo.entity.Vehical;
import in.brytcode.jpademo.entity.model.VehicalModel;
import in.brytcode.jpademo.service.AadharService;
import in.brytcode.jpademo.service.EmployeeService;
import in.brytcode.jpademo.service.VehicalService;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JpademoApplication.class, args);
		EntityManager em = applicationContext.getBean(EntityManager.class);
		/*
		 * ProductService prodService =
		 * applicationContext.getBean(ProductService.class);
		 * 
		 * Product prod = new Product(); prod.setId(UUID.randomUUID().toString());
		 * prod.setName("aeo freshner"); prod.setCategory("grocery");
		 * prod.setPrice(BigDecimal.valueOf(250));
		 * 
		 * prodService.saveProduct(prod);
		 * 
		 * System.out.println(prodService.getAllProducts());
		 * 
		 * System.out.println(prodService.getAllProductsByCategory("stationary"));
		 */

		EmployeeService empService = applicationContext.getBean(EmployeeService.class);

		AadharService aadharService = applicationContext.getBean(AadharService.class);
		
		VehicalService vehicalService = applicationContext.getBean(VehicalService.class);

		/*
		 * Employee emp = new Employee(); emp.setEmpId(1); emp.setEmpName("Kumar");
		 * emp.setDoj(new Date());
		 * 
		 * Aadhar aadhar = new Aadhar(); aadhar.setAadharId("9652 1235 6541");
		 * aadhar.setAddress("Naidupet"); aadhar.setDob(new Date());
		 * aadharService.save(aadhar);
		 * 
		 * emp.setAadhar(aadhar); empService.saveEmp(emp);
		 * 
		 * aadhar.setEmp(emp); aadharService.save(aadhar);
		 */

		Employee emp = empService.getEmp(1);
		
		/*
		 * Vehical vehicalOne = new Vehical(); vehicalOne.setRegNo("AP10A1212");
		 * vehicalOne.setColor("Red"); vehicalOne.setModel("Fz");
		 * 
		 * Vehical vehicalTwo = new Vehical(); vehicalTwo.setRegNo("BH1341");
		 * vehicalTwo.setColor("GREEN"); vehicalTwo.setModel("Nexon");
		 * 
		 * vehicalService.save(vehicalOne); vehicalService.save(vehicalTwo);
		 * 
		 * emp.getVehicals().add(vehicalOne); emp.getVehicals().add(vehicalTwo);
		 * 
		 * empService.saveEmp(emp);
		 */
		
		List<VehicalModel> vehicals = empService.getVehicalModels(1);
		System.out.println(vehicals);
		
		Vehical vehical = vehicalService.get("AP10A1212");
		
		/*
		 * Aadhar aadhar = aadharService.get("9652 1235 6541");
		 * System.out.println(aadhar);
		 */
		System.out.println("END");

	}

}
