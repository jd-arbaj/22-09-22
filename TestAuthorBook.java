package com.inheritance.pll;
import com.inheritance.bll.Author;
import com.inheritance.bll.Book;
public class TestAuthorBook {

	public static void main(String[] args) {
		
	
	Author A1 = new Author();
	Author A2 = new Author("Arbaj  ", "arbajsheikh2841@gmail.com  ");
	
	System.out.println(A2);
	System.out.println("Name :- "+ A2.getName());
	System.out.println("Email "+ A2.getEmail());
	System.out.println("*******************************\n *****++++++++++++++++++++****");
	
	Book B1 = new Book("ISBN532", "Dennis Ritchie",A1, 430.50, 60);
	System.out.println(A2);
	
	System.out.println("*****************************");
	
	System.out.println("ISBN - "+ B1.getISBN());
	System.out.println("Name " + B1.getName());
	System.out.println("Price "+ B1.getPrice());
	System.out.println("Qty "+ B1.getQty());
	
	System.out.println("THANK YOU!");
}
}