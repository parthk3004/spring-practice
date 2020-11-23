package com.parth.org.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.*;
@RestController

public class FunRestController {
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

