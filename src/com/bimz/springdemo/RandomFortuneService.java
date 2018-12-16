package com.bimz.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = { "beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"the journey is the reward" };

	@Override
	public String getFortune() {
		return data[new Random().nextInt(data.length)];
	}

}
