package com.evergent.corejava.oops;

 class personData {

	
		// TODO Auto-generated method stub
    public void myPersonData() {
    	System.out.println("person data clas method");
    	
    }}
    class personInfo extends personData{
    	public void mydetails() {
    		System.out.println("personInfo class method");
    	}
    }
   public class MultiLevelInheritance extends personInfo{
    	public void show() {
    		System.out.println("local method");
    	}
    	public static void main(String args[]) {
    	
    	MultiLevelInheritance ob=new MultiLevelInheritance();
    	ob.myPersonData();
    	ob.mydetails();
    	ob.show();
    }}
    
    
    
	


