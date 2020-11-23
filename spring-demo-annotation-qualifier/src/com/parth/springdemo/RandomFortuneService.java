package com.parth.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
// create a array of string
	private String[] data = {
			"Beaware of the wolf in sheep's clothing",
			"Saftey better then Cure",
			"you are the creator of your own Destiny"
			
	};
	// create a random number generator
	private Random myRandom =new Random();
	
	
	@Override
	public String getFortune() {
	// pick a random string from array
	int index = myRandom.nextInt(data.length);
	String theFortune = data[index];
	
		
		return theFortune;
	}

}
