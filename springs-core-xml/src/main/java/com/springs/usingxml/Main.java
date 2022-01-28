package com.springs.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springs/usingxml/config.xml");
		Employee e1 = context.getBean("employee", Employee.class);
		
		System.out.println(e1.getE_id()+" "+e1.getE_name());
		System.out.println(e1);
	}

}
