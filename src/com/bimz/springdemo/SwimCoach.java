package com.bimz.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${me.email}")
	public String email;
	
	@Value("${me.phone}")
	public String phone;
	
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

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	
	

}
