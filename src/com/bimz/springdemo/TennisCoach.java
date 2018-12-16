package com.bimz.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component // by befault tennisCoach
public class TennisCoach implements Coach {

	@Autowired
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

}
