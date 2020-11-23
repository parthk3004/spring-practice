package com.parth.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 10km as a warm up.";
	}

	@Override

	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
