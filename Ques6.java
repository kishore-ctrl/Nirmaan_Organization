package com.pack;
import java.util.Scanner;
public class Ques6 {
	public static void main(String[] args) {
		System.out.println("enter the student mark :");
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark<35) {
			System.out.println("you are fail, study hard");
		}
		else if(mark>=35) {
			System.out.println("you are pass, Good");
		}
	}

}
