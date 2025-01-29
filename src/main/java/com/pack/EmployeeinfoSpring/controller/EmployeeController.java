package com.pack.EmployeeinfoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.EmployeeinfoSpring.service.EmployeeDaoService;
import com.pack.EmployeeinfoSpring.service.EmployeeInfo;

@RestController
public class EmployeeController implements ErrorController {

	// Defining for Error page
	protected static final String PATH = "/error";

	// Return a HTML based string to print useful information if entered a incorrect
	// URL
	@GetMapping(value = PATH)
	public String getErrorMessage() {
		return """
						<h2 style="font-weight: bold; color: red; margin: 2rem 0;">Error 404! Please check the URL</h2>
							<p>The requested resource was not found.</p>
						<h3 style="font-family: monospace; font-size: smaller; margin-top: 1rem;">Correct Usage:</h3>
						  <ul>
						    <li style="font-family: monospace;">localhost:2020/app/employees</li>
						    <li style="font-family: monospace;">localhost:2020/app/employee/{id}</li>
						  </ul>
				""";
	}

	// This needs to be implemented for ErrorController functional interface
	public String getErrorPath() {
		return PATH;
	}

	// Referring another (DAO) component here
	@Autowired
	private EmployeeDaoService service;

	// Hello World!
	@GetMapping(value = "/")
	public String sayHello() {
		return "Welcome to the Employee Info App!!";
	}

	// Get Request Mapping to list all employees
	@GetMapping(value = "/employees")
	public List<EmployeeInfo> getAllEmployees() {
		return service.findAll();
	}

	// Get Request Mapping and retrieve individual employee data
	@GetMapping(value = "/employee/{id}")
	public EmployeeInfo getEmployeeInfo(@PathVariable Integer id) {
		return service.findOne(id);
	}

}
