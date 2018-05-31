package com.emp.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SERVICEA")
public interface IEmployee {
	@GetMapping("/employee")
	public Employee getEmployeeDetails();
}
