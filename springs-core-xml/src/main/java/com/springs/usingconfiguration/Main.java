package com.springs.usingconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		Coach c3 = con.getBean("cricketService",Coach.class);
		Coach c4 = con.getBean("footballService",Coach.class);
		
		System.out.println(c3.dailyWorkOut());
		System.out.println(c3.updates());
		
		System.out.println(c4.dailyWorkOut());
		System.out.println(c4.updates());
	}

}
