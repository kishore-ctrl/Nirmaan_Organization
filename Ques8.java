package com.pack;
import java.util.Scanner;
public class Ques8 {
	public static void main(String[] args) {
		System.out.println("enter the year you want ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0) {
			System.out.println("it is a leap year");
		}
		else {
			System.out.println("it is not leap year");
		}
	}

}
