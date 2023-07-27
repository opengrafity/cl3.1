package dev.grafity.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import dev.grafity.springaop.service.NewTaxService;

@ComponentScan(basePackages = "dev.grafity.springaop")
@EnableAspectJAutoProxy
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class); 
        NewTaxService ots = applicationContext .getBean(NewTaxService.class);
        ots.calculate(600000);
    }
}
