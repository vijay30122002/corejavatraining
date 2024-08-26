package com.evergent.corejava.Exceptions;

class ProductNotFoundException extends Exception{
	
	public ProductNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		System.out.println("hello"+message);
	}
}
public class ProductImpl {
	int k=150;
	public void myData() throws ProductNotFoundException{
		try {
		if(k>100)
			throw new ProductNotFoundException("product is not there");
		else {
			System.out.println("product is there");
		}}
		catch(ProductNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ProductImpl p1=new ProductImpl();
		p1.myData();}
		catch(ProductNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("program continues");

	}

}
