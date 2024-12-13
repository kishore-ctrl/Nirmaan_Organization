package day15;
import java.util.Scanner;
public class UserInterface {
public static void main(String[] args) {
	Calculator calci = new Calculator();
	Scanner sc=new Scanner(System.in);
	boolean Istrue=true;
	while(Istrue) {
		System.out.println("1 for Add :");
		System.out.println("2 for Sub :");
		System.out.println("3 for Div :");
		System.out.println("4 for Mul :");
		System.out.println("0 for Exit");
		int key=sc.nextInt();
		
		if (key==1){
			System.out.println("enter the Fnum");
			int Fnum=sc.nextInt();
			System.out.println("enter the Snum");
			int Snum=sc.nextInt();
			System.out.println(calci.add(Fnum, Snum));
			
		}
		else if(key==2) {
			System.out.println("enter the Fnum");
			int Fnum=sc.nextInt();
			System.out.println("enter the Snum");
			int Snum=sc.nextInt();
			System.out.println(calci.sub(Fnum, Snum));		}
	
	
		else if(key==3){
			System.out.println("enter the Fnum");
			int Fnum=sc.nextInt();
			System.out.println("enter the Snum");
			int Snum=sc.nextInt();
			System.out.println(calci.mul(Fnum, Snum));}
			
		else if(key==4) {
			System.out.println("enter the Fnum");
			int Fnum=sc.nextInt();
			System.out.println("enter the Snum");
			int Snum=sc.nextInt();
			System.out.println(calci.add(Fnum, Snum));
		}
		else if(key==0) {
			Istrue=false;
			System.out.println("exited successfully");
		}
		else {
			System.out.println("enter correct choice");
			
			
			
			
		}
		
		
}}}

