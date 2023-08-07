package com.amfibyn.springjdbcdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.amfibyn.springjdbcdemo.model.Account;
import com.amfibyn.springjdbcdemo.repository.AccountsDao;

@Configuration
@ComponentScan(basePackages = "com.amfibyn.springjdbcdemo")
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(App.class);
		
		AccountsDao accountDao = appContext.getBean(AccountsDao.class);
		
		Account acc = new Account();
		acc.setAccountId(11);
		acc.setAccountName("Balu");
		acc.setBalance(1258465.20);
		
		accountDao.storeAccounts(acc);
		System.out.println(accountDao.getAccounts());
		
		
	}
}
