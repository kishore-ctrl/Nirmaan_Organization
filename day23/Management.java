package day23;
import java.util.Scanner;
import java.util.ArrayList;

public class Management {
	public static void main(String[] args) {
		Book b1=new Book();
		ArrayList<Book> al=new ArrayList<Book>();
		Scanner sc=new Scanner(System.in);
		boolean isthere=true;
		while(isthere) {
			System.out.println("1 for add book");
			System.out.println("2 for update book");
			System.out.println("3 for remove book");
			System.out.println("4 for show details");
			System.out.println("0 for exit");
			System.out.println("choose ur option");
			int key=sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.println("enter author");
				String author=sc.nextLine();
				//sc.nextLine();
				System.out.println("enter book price");
				double price=sc.nextDouble();
				sc.nextLine();
				System.out.println("enter title");
				String title=sc.nextLine();
				System.out.println("enter id");
				int id=sc.nextInt();
				al.add(b1= new Book(title, author, price, id));
				
			}
			if(key==2) {
				System.out.println("enter the book id to update :");
				int id1=sc.nextInt();
				boolean istrue=false;
				for(Book book1: al) {
					if(id1==b1.getid()) {
						System.out.println("enter title");
						String title=sc.nextLine();
						book1.settitle(title);
						System.out.println("enter price");
						double price=sc.nextDouble();
						book1.setprice(price);
						System.out.println("enter author");
						String author=sc.nextLine();
						book1.setauthor(author);
						
					}
				}
				if(!istrue) {
					System.out.println("not there");
				}
			}
			if(key==3) {
				
				System.out.println("enter the book id to update :");
				int id2=sc.nextInt();
				boolean istrue=false;
				for(Book book1: al) {
					if(id2==b1.getid()) {
						al.remove(book1);
						System.out.println("data has been removed successfully");
						break;
					}
				}
				if(!istrue) {
					System.out.println("not there");
				}
			}
			if(key==4) {
				System.out.println("to view book details");
				System.out.println(b1.toString());
			}
			if(key==0) {
				System.out.println("program has been stopped");
				isthere=false;
			}
		}
	}
	

}
