package com.evergent.corejava.Exceptions;

public class StackOverFlowErrorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			recursiveMethod();
		}catch(Exception e) {
			System.out.println("stackoverfloweror get caught "+e.getMessage());
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
