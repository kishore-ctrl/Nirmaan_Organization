package com.day1;
import java.util.Scanner;
public class Day5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println(name.substring(0,3));
		System.out.println(name.charAt(0));
		System.out.println(name.length());
	}

}
