package com.inheritance.bll;

public class Book extends Author {

	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book () {
		super();
	}
	
	public Book (String isbn, String name, Author author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		
		
	}
	public Book (String isbn, String name, Author author, double price, int qty) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
		
	}
	public String getISBN() {
		return isbn;
	}
	public String getName() {
		return name;
		
	}
	public Author getAuthor() {
		return author;
		
	}
	public double getPrice() {
		return price;
	}
	public void  setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	 public String getAuthorName() {
		return author.getName();
	} 
	
	@Override
	public String toString() {
		return  "Book [ isbn = "+ isbn+ ",Name = " + name + " , Author = [ "+author+"Price = "+ price +" qty = "+ qty +" ]";
	}
}
