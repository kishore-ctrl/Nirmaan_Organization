package com.day1;

public class Main2 {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.SetName("kishore");
		e1.SetAge(22);
		e1.SetEmpId(1224);
		e1.SetDepartment("java");
		//GETTER
		System.out.println(e1.getname());
		System.out.println(e1.getAge());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getDepartment());
		//CONSTRUCTOR
		Employee e2 = new Employee("stepheney",22,4037,"cse");
		System.out.println("<>   CONSTRUCTOR   <>");
		System.out.println(e2.getname());
		System.out.println(e2.getAge());
		System.out.println(e2.getEmpId());
		System.out.println(e2.getDepartment());
		//TOSTRING
		System.out.println("<>    TOSTRING    <>");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	
		
	}
	
	
}
