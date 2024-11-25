package com.day1;
import java.util.Scanner;
public class Simple_Calci {
public static void main(String args[]) {
	int fnum;
	int Snum;
	System.out.println("enter your choice");
	System.out.println("0 for add");
	System.out.println("1 for sub");
	System.out.println("2 for multi");
	System.out.println("3 for div");
Scanner sc=new Scanner(System.in);
int key=sc.nextInt();

fnum=sc.nextInt();
Snum=sc.nextInt();


if(key==0) {
int total= fnum+Snum;
	System.out.println("addition :"+total);
}
else if(key==1){
	int total=fnum-Snum;
	System.out.println("total :"+total);
}
else if(key==2){
	int total=fnum*Snum;
	System.out.println("total :"+total);
}
else if(key==3) {
	int total=fnum/Snum;
	System.out.println("total :"+total);
}
else if(key==4) {
	int total=fnum%Snum;
	System.out.println("total :"+total);
	}
else {
	System.out.println("enter the correct choice");
}

}
}

