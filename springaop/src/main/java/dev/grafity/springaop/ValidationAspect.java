package dev.grafity.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {
	/*
	 * @After("execution(* dev.grafity.springaop.service.*.calculate(..))") public
	 * void validateIncome() { System.out.println("Tax validation"); }
	 * 
	 * 
	 * @Before("execution(* dev.grafity.springaop.service.PaymentService.pay(..))")
	 * public void validateAmount() { System.out.println("Before actual method"); }
	 * 
	 * 
	 * 
	 * @Before("target(dev.grafity.springaop.service.PaymentService)") public void
	 * validateAmount() { System.out.println("Before actual method"); }
	 * 
	 * 
	 * 
	 * 
	 * @Around("within(dev.grafity.springaop.service.PaymentService)") public void
	 * validateAmount(ProceedingJoinPoint jp) throws Throwable {
	 * System.out.println(jp.getSignature()); if ((Integer) jp.getArgs()[0] < 0) {
	 * System.err.println("amount can not lesser than zero"); } jp.proceed();
	 * System.out.println("THE END.....");
	 * 
	 * }
	 */

	/*
	 * @Before("this(dev.grafity.springaop.service.PaymentService)") public void
	 * validateAmount(JoinPoint jp) {
	 * System.out.println("Before actual method this");
	 * System.out.println(jp.getSignature()); }
	 */
	/*
	 * @Before("@annotation(dev.grafity.springaop.ValidateAmount)") public void
	 * validateAmount(JoinPoint jp) { System.out.println(jp.getSignature()); }
	 */
	
	//@After("payPCD()")
	public void after(JoinPoint jp ) {
		System.out.println(jp.getSignature());
		System.out.println(jp.getTarget());
		System.out.println(jp.getArgs()[0]);
		System.out.println("After");
	}
	
	@AfterThrowing(pointcut = "payPCD()", throwing = "myex")
	public void afterThrows(JoinPoint jp , Exception myex) {	
		System.out.println("After Exception");
		System.out.println(myex.getMessage());
	}
	
	@AfterReturning(pointcut = "payPCD()", returning = "result")
	public void afterRet(JoinPoint jp, Object result ) {	
		System.out.println("After Successfully Returned" + result);
	}
	
	
	//@Before("payPCD()")
	public void before() {
		System.out.println("Before");
	}
	
	//@Around("payPCD()")
	public int around(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("Around - Before");
		Object[] args = pjp.getArgs();
		args[0] = 1000;
		int returnValue = (Integer)pjp.proceed(args);
		System.out.println("Around - After");
		System.out.println("Around - "+returnValue);
		return 10;
	}
	
	@Pointcut("execution(* dev.grafity.springaop.service.UPIPaymentService.pay(..))")
	public void payPCD() {}
}
