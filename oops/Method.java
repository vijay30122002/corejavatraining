package com.evergent.corejava.oops;

public class Method {
// no arguments no return type
	public void display() {
		System.out.println("this is vijay");
	}
	//no arguments return type
	public int add() {
		return 100;
	}
	//arguments no return type
	public void show(int a,int b) {
		System.out.println("addition is"+(a+b));
	}
	//argumnets return type
	public int mul(int a,int b) {
		return a*b;
	}
	public static void main(String args[]) {
		Method met=new Method();
		met.display();
		System.out.println(met.add());
		met.show(5,6);
		System.out.println(met.mul(4,9));
	}
}
