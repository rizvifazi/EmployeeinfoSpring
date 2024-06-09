package com.pack.EmployeeinfoSpring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoService {

	private static List<EmployeeInfo> employees = new ArrayList<>();

	// Static block to pre-load dummy employees
	static {
		employees.add(new EmployeeInfo(1, "Alice Johnson", 52000.00, "San Francisco, CA"));
		employees.add(new EmployeeInfo(2, "Bob Williams", 48000.00, "Seattle, WA"));
		employees.add(new EmployeeInfo(3, "Charlie Miller", 61000.00, "New York, NY"));
		employees.add(new EmployeeInfo(4, "Diana Garcia", 39000.00, "Austin, TX"));
		employees.add(new EmployeeInfo(5, "Ethan Lee", 45000.00, "Chicago, IL"));
	}

	// returns list of employees
	public List<EmployeeInfo> findAll() {
		return employees;
	}

	//to return employee details based on @Pathvariable String
	public EmployeeInfo findOne(int id) {

		for (EmployeeInfo e : employees) {
			if (e.getId() == id)
				return e;
		}
		return null;
	}

}
