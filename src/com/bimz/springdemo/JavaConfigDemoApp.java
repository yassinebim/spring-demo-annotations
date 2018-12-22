 package com.bimz.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach tennisCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		Coach tennisCoach2 = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(tennisCoach2.getDailyFortune());
		
		
		context.close();
	}

}
