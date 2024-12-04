package com.pack;//4.odd or even?
import java.util.Scanner;
public class Ques4 {
	public static void main(String[] args) {
		System.out.println("enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("it is even number");
			
		}
		else {
			System.out.println("it is odd number");
		}
	}

}
