package com.evergent.corejava.Exceptions;

import com.evergent.corejava.static1.staticDemo5;

class InvalidScoreException extends Exception{
		public InvalidScoreException(String message) {
			super(message);
		}
	}
public class userDefinedExceptionDemo12 {
	public static void withdraw(int score) throws InvalidScoreException{
		//double balance=100;
		if(score<0 || score>100 )
			throw new InvalidScoreException("score must be greater");
		else {
			System.out.println("score is valid");
		}
	}
	
	public static void main(String[] args) {
		try {
			withdraw(500);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
	
	
	

