package day26;

import java.util.Scanner;
import java.util.ArrayList;
public class MainSimpleEmployee {
	public static void main(String[] args) {
		SimpleEmployee se = new SimpleEmployee();
		ArrayList<SimpleEmployee> al= new ArrayList<SimpleEmployee>();
		Scanner an = new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("Enter Employee Detail :");
		System.out.println("1 for Add Employee ");
		System.out.println("2 for Remove Employee");
		System.out.println("3 for Display Employee List");
		System.out.println("4 for Search Employee by Name/I'd");
		int key =an.nextInt();
		an.nextLine();
		 switch (key) {
			case 1: {
				System.out.println("Enter Employee I'D :");
				int empId=an.nextInt();
				an.nextLine();
				System.out.println("Enter Employee Name :");
				String empName=an.nextLine();
				
				System.out.println("Enter Employee Department :");
				String dept=an.nextLine();
				
				System.out.println("Enter Employee Mobile Num :");
				long mobNo=an.nextLong();
				al.add(se=new SimpleEmployee(empName,empId,dept,mobNo));
				break;
				}
			
			case 2:{
					System.out.println("Enter Employee I'D : ");
					int id=an.nextInt();
					for (SimpleEmployee se1 : al) {
						 if(id==se1.getEmpId()){
							al.remove(al.indexOf(se));
							break;
						}
						}
					break;
			}
			case 3:{
				System.out.println(al);
				break;
			}
		 }

		}
	}
}


