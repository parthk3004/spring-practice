package com.parth.org.mycoolapp.rest;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
@RestController

public class FunRestController {
	// inject properties for coach and team name from application.property file
	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;
	
// expose new endpoint
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach:" + coachName + ", Team name:" +teamName;
		
	}
	
//expose "/" that return hello world
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello world Time on Server is" + LocalDateTime.now();
		
	}
	
	// expose new endpoint for workout
	
	@GetMapping("/workout")
	public String getDailyWorkout()
	{
		return "run a hard 5k";
		
	}
}

