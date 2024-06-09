package com.pack.Employeeinfosb.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoService {

	private static List<EmployeeInfo> employees = new ArrayList<>();

	// Static block to pre-load dummy employees
	static {
		employees.add(new EmployeeInfo(1, "Praveen Kumar", 34000.00, "Trichi, Chennai"));
		employees.add(new EmployeeInfo(2, "Sanjeev Singh", 24000.00, "Bangalore, Hydrabad"));
		employees.add(new EmployeeInfo(3, "Kumar Panvar", 45000.00, "Some City, Kolkatta"));
		employees.add(new EmployeeInfo(4, "Dilip Kher", 11000.00, "Aluva, Cochi"));
		employees.add(new EmployeeInfo(5, "Anita Desai", 27000.00, "Logi, Panjab"));
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
