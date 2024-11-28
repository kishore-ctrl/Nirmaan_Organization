package com.day1;
import java.util.Scanner;
public class Simple_Calci {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	boolean var= true;
	while(var) {
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for mul");
		System.out.println("press 4 for div");
		System.out.println("press 5 for exit");
		System.out.println("enter the key");
		int key=sc.nextInt();
		
		
		switch(key) {
		case 1:{
		System.out.print("enter the first number");
		int fnum=sc.nextInt();
		System.out.print("enter the second number");
		int Snum=sc.nextInt();
		int total=fnum+Snum;
		System.out.println("total"+total);
		break;
		}
		case 2:{
			System.out.println("enter the first number");
			int f2num=sc.nextInt();
			System.out.println("enter the second number");
			int S2num=sc.nextInt();
			int total=f2num-S2num;
			System.out.println("total"+total);
			break;}
		case 3:{
			System.out.println("enter the first number");
			int f3num=sc.nextInt();
			System.out.println("enter the second number");
			int S3num=sc.nextInt();
			int total=f3num*S3num;
			System.out.println("total"+total);
			break;}
		case 4:{
			System.out.println("enter the first number");
			int f4num=sc.nextInt();
			System.out.println("enter the second number");
			int S4num=sc.nextInt();
			int total=f4num%S4num;
			System.out.println("total"+total);
			break;}
		case 5:{
			var=false;
			System.out.println("program has been stopped");
			break;
		}
		default:{
			
			System.out.println("invalid choosing");
			break;
		}
			
		}
		
	}

}}


