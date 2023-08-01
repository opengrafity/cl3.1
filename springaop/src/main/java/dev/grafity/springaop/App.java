package dev.grafity.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import dev.grafity.springaop.service.NewTaxService;
import dev.grafity.springaop.service.Payment;
import dev.grafity.springaop.service.PaymentService;
import dev.grafity.springaop.service.UPIPaymentService;

@ComponentScan(basePackages = "dev.grafity.springaop")
@EnableAspectJAutoProxy
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class); 
		/*
		 * NewTaxService ots = applicationContext .getBean(NewTaxService.class);
		 * ots.calculate(600000);
		 */
        Payment pService = applicationContext.getBean("upi",Payment.class);
        int ret = pService.pay(500);
        System.out.println(ret);
    }
}
