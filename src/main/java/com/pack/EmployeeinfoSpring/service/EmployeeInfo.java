package com.pack.EmployeeinfoSpring.service;

//No annotations required here @Entity can be used if we are using JPA
public class EmployeeInfo {

	private Integer id;
	private String name;
	private Double salary;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmployeeInfo() {
	}

	public EmployeeInfo(String name) {
		this.name = name;
	}

	public EmployeeInfo(Integer id, String name, Double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
