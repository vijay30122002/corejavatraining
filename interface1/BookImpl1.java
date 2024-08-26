package interface1;

import com.evergent.corejava.static1.staticDemo5;

public class BookImpl1 implements Book{

	public void bookTitle() {
		System.out.println("core java");
	}
	public void bookAuthor() {
		System.out.println("Oracle corp");
	}
	public void show() {
		System.out.println("local methods ");
	}
	public void bookPrice() {
		System.out.println("550");
	}
	public static void main(String args[]) {
		
	
	Book b1=new BookImpl1();
	b1.bookTitle();
	b1.bookAuthor();
	b1.bookPrices();

	
}}
