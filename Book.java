package com.day1;

public class Book {
	String title;
	String author;
	double price;
	int numofcopies;
	
	Book(String title, String author,double price, int numofcopies){
		
		this.title=title;
		this.author=author;
		this.price=price;
		this.numofcopies=numofcopies;
	}
	Book(){
		
	}
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public int numofcopies() {
		return numofcopies;
	}
	
	public void settitle() {
		this.title=title;
	}
	public void setauthor() {
		this.author=author;
	}
	public void setprice() {
		this.price=price;
	}
	public void setnumofcopies() {
		this.numofcopies=numofcopies;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", numofcopies=" + numofcopies
				+ "]";
	}
	
	}


