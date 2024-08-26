package com.evergent.corejava.static1;

public class staticDemo5 {
static {
	System.out.println("static block");
}
static String name="name";
static public void myData() {
	System.out.println("mydata");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(staticDemo5.name);
		staticDemo5.myData();
	}

}
