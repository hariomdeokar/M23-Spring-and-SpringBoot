package com.cg.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		/*Sim s=new Airtel();
		s.Calling();
		s.data();
		
		Sim s1=new Jio();
		s1.Calling();
		s1.data();*/
		
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration....loaded");
		
		Sim obj=(Airtel)a.getBean("sim",Sim.class);
		obj.Calling();
		obj.data();
		
//		Jio obj1=(Jio)a.getBean("jio");
//		obj1.Calling();
//		obj1.data();

	}

}
