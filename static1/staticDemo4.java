package com.evergent.corejava.static1;



public class staticDemo4 
{
static String cname="India";
String name="ravi";
static public void myData() 
{
	System.out.println("mydata");
}
public void myshow() 
{
	myData();
	System.out.println("myshow non static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(cname);
		myData();
	staticDemo4 sd1=new staticDemo4();
	sd1.myshow();
		
		
	}

}
