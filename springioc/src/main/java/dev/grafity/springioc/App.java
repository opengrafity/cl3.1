package dev.grafity.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "dev.grafity.springioc")
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app =
    		    new ClassPathXmlApplicationContext(new String[] {"resources/Spring.xml"});
    	//AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(App.class);
    	ITRFiler filer = app.getBean(ITRFiler.class);
    	filer.fileTax();     
    }
}
