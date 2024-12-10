package day14;

import java.util.Scanner;

public class EmployeeManagement {
public static void main(String[] agrs) {
	
	Employee E1=new Employee();
	Employee E2=null;
	Scanner sc = new  Scanner(System.in);
	boolean isTrue=true;
	
	while(isTrue) {
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("0 for exit");
	    System.out.println("Enter your choice");
	    int key=sc.nextInt();
	    sc.nextLine();
	    
	    switch (key) {
		case 1: {
			System.out.println("enter your employee name");
			String name=sc.nextLine();
			
		
			System.out.println("enter your employee id ");
			int id=sc.nextInt();
			
		
			System.out.println("enter your employee phn ");
			long phone=sc.nextInt();
			sc.nextLine();
			
			

			System.out.println("enter your employee dept");
			String dept=sc.nextLine();
			
			
			E1.setName(name);
			E1.setId(id);
			E1.setPhone(phone);
			E1.setDept(dept);
			break;
			
		}
		case 2:{
			System.out.println("enter your employee name ");
			String name=sc.nextLine();
			System.out.println("enter your employee id ");
			int id=sc.nextInt();
			System.out.println("enter your employee phn ");
			long phone=sc.nextInt();
			System.out.println("enter your employee dept");
			String dept=sc.nextLine();
			
			E2=new Employee(name,id,phone,dept);
			
			break;
		}
		
		case 3:{
			System.out.println(E1);
			System.out.println(E2);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
}
}
