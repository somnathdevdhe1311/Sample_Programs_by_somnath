package com.somnath.devdhe.java8.pojo;

public class Employee {

	private long id;
	
	private String name;
	
	private String deptName;
	
	private String status;
	
	private double salary;
	
	private long deptId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public Employee(long id, String name, String deptName, String status, double salary, long deptId) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.status = status;
		this.salary = salary;
		this.deptId = deptId;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + ", status=" + status + ", salary="
				+ salary + ", deptId=" + deptId + "]";
	}
	
	
}
