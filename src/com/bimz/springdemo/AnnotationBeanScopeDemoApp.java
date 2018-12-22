package com.bimz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		Coach tennisCoach2 = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(tennisCoach2.getDailyFortune());
		
		
		context.close();
		

	}

}
