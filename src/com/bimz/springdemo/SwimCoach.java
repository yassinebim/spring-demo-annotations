package com.bimz.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000m to warm up";
	}

	@Override
	public String getDailyFortune() {
		return "Swim coach says : "+this.fortuneService.getFortune();
	}

}
