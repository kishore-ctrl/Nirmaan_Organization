package com.day1;
import java.util.Scanner;
public class SingleBookManagement {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2=new Book();
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		
		while(isTrue) {
			System.out.println("enter choice");
			System.out.println("1 for add or update");
			System.out.println("2 for Constructor");
			System.out.println("3 for show");
			System.out.println("4 for exit");
			int key=sc.nextInt();
			sc.nextLine();
			
			switch(key) {
			case 1:{
				System.out.println("enter the title");
				String titleString=sc.nextLine();
				b1.settitle();
				
				System.out.println("enter the author");
				String author=sc.nextLine();
				b1.setauthor();
				
				System.out.println("enter the price");
				String price=sc.nextLine();
				b1.setprice();
				
				System.out.println("No Of Copies");
				int NoofCopies=sc.nextInt();
				b1.setnumofcopies();
				
			}
			case 2:{
				System.out.println("enter title");
				String title=sc.nextLine();
				System.out.println("enter the author");
				String author=sc.nextLine();
				System.out.println("enter the price");
				int price=sc.nextInt();
				System.out.println("No Of Copies");
				int numofcopies=sc.nextInt();
				
				b2=new Book(title,author,price,numofcopies);
				break;
			}
			case 3:{
				System.out.println(b1);
				break;
				
			}
			case 4:{
				System.out.println("program exited");
				isTrue=false;
				break;
			}
			default:{
				System.out.println("enter the correct choice");
			}
			}
		}
		
		
	}

}
