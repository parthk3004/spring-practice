package com.parth.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		// print out the result
		System.out.println("\nPointing to same object :  " + result);
		
		System.out.println("\nPointing memory location for thecoach  :  " + theCoach);
		
		System.out.println("\nPointing memory location for alphacoach :  " + alphaCoach + "\n");
// close context
		context.close();
	}

}
