package com.parth.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define default cunstuctor
	public TennisCoach()
	{
		System.out.println(">> inside default constructor");
	}
	
	//define my init metod
	
	@PostConstruct
	
	public void doMyStartupStuff()
	{
		System.out.println(".. TennisCoach inside of doMyStartupStuff");
		
	}
	
//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(".. TennisCoach inside of doMyCleanupStuff");
		
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
