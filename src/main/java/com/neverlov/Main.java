package com.neverlov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
	
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-all.xml");

		Man man = context.getBean(Man.class);
		man.say();
		context.close();
	}
}
