package com.parth.springrest;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			
			ObjectMapper mapper = new ObjectMapper();
	
	//read json file and mapto pojo
	
	
	//data lite.json
	
	Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
	
	//print first name and last name
	System.out.println(("First name = " + theStudent.getFirstName()));
	System.out.println("Last name = " + theStudent.getLastName());
	
}
catch (Exception exc)
{
	exc.printStackTrace();
}
}
}
