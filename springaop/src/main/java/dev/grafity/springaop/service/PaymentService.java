package dev.grafity.springaop.service;

import org.springframework.stereotype.Service;

import dev.grafity.springaop.ValidateAmount;

@Service("ps")
public class PaymentService implements Payment{
	//@ValidateAmount(msg="valid")
	public int pay(int amount) throws Exception {
		
		int balance = 1000;
		if(amount < 0) {
			System.out.println("Amount can not be lesser than zero");			
		}
		System.out.println(amount +" paid");
		
		balance = balance - amount;
		
		if(balance<0) {
			throw new Exception("Negaive balance");
		}
		return balance;
	}
}
