package com.day1;

public class Employee {
	private String Name;
	private int Age;
	private int EmpId;
	private String Department;
	
	public Employee() {
		
	}
	public Employee(String Name,int Age,int EmpId,String Department) {
		this.Name=Name;
		this.Age=Age;
		this.EmpId=EmpId;
		this.Department=Department;
		
	}
	public String getname() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public int getEmpId() {
		return EmpId;
	}
	public String getDepartment() {
		return Department;
	}
	
	public void SetName(String Name) {
	this.Name=Name;	
	}
	public void SetAge(int Age) {
		this.Age=Age;
	}
	public void SetEmpId(int EmpId) {
		this.EmpId=EmpId;
	}
	public void SetDepartment(String Department) {
		this.Department=Department;
	}
	public String toString() {
		return "Employee Name :"+Name+"\nEmployee Age :"+Age+"\nEmployeeID :"+EmpId+"\nDepartment :"+Department;
	}
	
}
