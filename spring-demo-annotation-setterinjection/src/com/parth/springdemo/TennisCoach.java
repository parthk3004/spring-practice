package com.parth.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	// define default cunstuctor
	public TennisCoach()
	{
		System.out.println(">> inside default constructor");
	}
	
	
	// define  a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> inside Setter Method setFortune");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
