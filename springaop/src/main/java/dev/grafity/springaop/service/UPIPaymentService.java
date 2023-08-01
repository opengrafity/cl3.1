package dev.grafity.springaop.service;

import org.springframework.stereotype.Service;

@Service("upi")
public class UPIPaymentService implements Payment{
	public int pay(int amount) throws Exception{
		System.out.println("UPI Payment" + amount);
		if(amount<0) {
			throw new Exception("Invalid Amount");
		}
		return amount;
	}
}
