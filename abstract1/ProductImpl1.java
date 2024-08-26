package com.evergent.corejava.abstract1;

public class ProductImpl1 extends Product
{

	public void newProduct() {
		System.out.println("this is method of abstract");
	}
	public void show() {
		System.out.println("this is local methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl1 p1=new ProductImpl1();
		p1.newProduct();
		p1.show();
		p1.newProduct1();

	}

}
