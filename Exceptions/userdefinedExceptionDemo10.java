package com.evergent.corejava.Exceptions;

import com.evergent.corejava.static1.staticDemo5;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}

	
}
 public class userdefinedExceptionDemo10{
	 public static void checkAge(int age)throws InvalidAgeException {
		 if(age<18) {
			 throw new InvalidAgeException("Age should be greater");
		 }
		 else {
			System.out.println("you are eligible");
		}
	 }
	 public static void main(String[] args) {
		try {
			checkAge(2);
		}
		catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("caught exception"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("program continues");
	}
 }
