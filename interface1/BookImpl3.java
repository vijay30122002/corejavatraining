package interface1;

import com.evergent.corejava.static1.staticDemo5;

public class BookImpl3 implements Book,NewBook{

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
	public void myNewBook() {
		System.out.println("my new book");
	}
	public static void main(String args[]) {
		
	
	BookImpl3 b1=new BookImpl3();
	b1.bookTitle();
	b1.bookAuthor();
	b1.bookPrice();
	b1.show();
	b1.myNewBook();
	
}}
