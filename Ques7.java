package com.pack;
import java.util.Scanner;
public class Ques7 {
	public static void main(String[] args) {
		System.out.println("enter your 5 subjects marks");
		int total;
		int avg;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the marks in maths:");
		int mark1=sc.nextInt();
		
		System.out.println("enter the marks in csc:");
		int mark2=sc.nextInt();
		
		System.out.println("enter the marks in biology:");
		int mark3=sc.nextInt();

		System.out.println("enter the marks in physics:");
		int mark4=sc.nextInt();

		System.out.println("enter the marks in social:");
		int mark5=sc.nextInt();

		 total=(mark1+mark2+mark3+mark4+mark5);
		 
		System.out.println("the calculated marks of total ="+total);
		
	}

}
