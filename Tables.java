package com.day1;
import java.util.Scanner;
public class Tables {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you need");
		int table=sc.nextInt();
		int i;
		for(i=1;i<=10;i++){
			System.out.println(table+"x"+i+"="+table*i);
		}
		
	}

}
