package com.springs.usingannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springs/usingannotations/annotation.xml");
		
		Coach c1 = con.getBean("cricketService", Coach.class);
		Coach c2 = con.getBean("footballService", Coach.class);
		
		
		System.out.println(c1==c2);
		System.out.println(c1.dailyWorkOut());
		System.out.println(c1.updates());
		
		System.out.println(c2.dailyWorkOut());
		System.out.println(c2.updates());
		

	}

}
