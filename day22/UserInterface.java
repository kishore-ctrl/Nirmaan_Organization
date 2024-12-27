package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Book b1=new Book();
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> al=new ArrayList<>();
		
	while(true) {
		
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("4 for remove");
		System.out.println("0 for exit");
		int key=sc.nextInt();
		sc.nextLine();
		
		if(key==1) {
			System.out.println("enter book name: ");
			String name=sc.nextLine();
			System.out.println("Enter price: ");
			double price=sc.nextDouble();
			al.add(b1=new Book(name,price));
		
		}
		
		if(key==2) {
			System.out.println("enter book name ");
			String select=sc.nextLine();
			boolean isTrue=false;
			for(Book book1: al) {
				if(select.equalsIgnoreCase(book1.getName())) {
					isTrue=true;
					System.out.println("enter book name to replace");
					String name=sc.nextLine();
					book1.setName(name);
					double price=sc.nextDouble();
					book1.setPrice(price);
				}
			}
			if(!isTrue) {
				System.out.println("not there!!");
				
			}
			
		}
		if(key==3) {
			System.out.println(al);
			
		}
		if(key==4) {
			System.out.println("Enter book name: ");
			String name=sc.nextLine();
			for(Book book1:al) {
				if(name.equalsIgnoreCase(book1.getName())) {
					al.remove(book1);
					}
			}
		}
		if(key==0) {
			System.out.println("program has stopped");
			break;
			
		}
		
		
	}
	}

}
