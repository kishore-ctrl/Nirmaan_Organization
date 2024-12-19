package day19;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		if(age>0) {
			System.out.println("your age is:"+age);
		}else {
			throw new ArithmeticException();
		}
	}
	catch(InputMismatchException e) {
		System.out.println("enter a number");
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally {
		System.out.println("finnaly work");
	}

}
}