package com.emp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice2Controller {

	@Autowired
	IEmployee iEmployee;
	
	@GetMapping("/micro2")
	public String microservice2Method() {
		return "Microservice 2 Info!..";
	}
	
	@GetMapping("/empdetails")
	public Employee getEmployeeDetailsFromMicro1() {
		
		return iEmployee.getEmployeeDetails();
	}
	
	
}
