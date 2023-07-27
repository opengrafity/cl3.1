package dev.grafity.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {
	@After("execution(* dev.grafity.springaop.service.*.calculate(..))")
	public void validateIncome() {		
		System.out.println("Tax validation");		
	}
}
