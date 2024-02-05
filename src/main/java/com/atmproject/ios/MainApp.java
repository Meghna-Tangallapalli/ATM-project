package com.atmproject.ios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Atm atm = context.getBean(Atm.class);
		String status = atm.withdraw();
		System.out.println(status);
	}
 
}
