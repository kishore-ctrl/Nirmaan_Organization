package com.pack;
//1.write a java program to cast vote if age>18?
import java.util.Scanner;
public class Nirmaan_Assesment1 {
public static void main(String args[]) {
	System.out.println("enter your age:");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	if(age<18){
		System.out.println("you are not eligible to vote");
	}
	else if(age>=18){
		System.out.println("you are eligible to vote");
		
	}
	
}}

