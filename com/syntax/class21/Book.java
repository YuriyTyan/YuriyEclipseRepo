package com.syntax.class21;

public class Book {
	
	String title, author, genre;
	int catalogNum;
	
	Book() {
	}
	Book(int catalogNum, String title, String author, String genre) {
		this.catalogNum=catalogNum;
		this.title=title;
		this.author=author;
		this.genre=genre;
	}
	public void register() {
		System.out.println("You registered "+catalogNum+", author: "+author+", title: "
				+title+", genre: "+genre);
	}
	
	public static void main(String[] args) {
		
		Book first = new Book(12345, "Gone with the virus","O'Henry","Documentary");
		first.register();
	}

}
