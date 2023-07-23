package dev.grafity.springioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "dev.grafity.springioc")
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(App.class);
    	ITRFiler filer = app.getBean(ITRFiler.class);
    	filer.fileTax();
    	
    }
}
