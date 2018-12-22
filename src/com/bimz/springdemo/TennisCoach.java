package com.bimz.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component // by befault tennisCoach
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	 * //Autowired is optional if there is no additional constructor of TennisCoach
	 * 
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	public TennisCoach() {
		System.out.println(">> Constructor of TennisCoach >>");
	}

//	@Autowired setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> setter setFortuneService of TennisCoach >>");
		this.fortuneService = fortuneService;
	}
	
	
//	@Autowired methode injection
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> method injection doSomeCrazyStuff of TennisCoach >>");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand Volley";
	}

	@Override
	public String getDailyFortune() {
		return "Tennis Coach says : " + this.fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("doing my startup stuff");
	}
	
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("Doing my destroy stuff");
	}

}
