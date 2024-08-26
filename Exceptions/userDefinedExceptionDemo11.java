package com.evergent.corejava.Exceptions;

import com.evergent.corejava.static1.staticDemo5;

class InsufficientFundsException extends Exception{
		public InsufficientFundsException(String message) {
			super(message);
		}
	}
public class userDefinedExceptionDemo11 {
	public static void withdraw(double amount) throws InsufficientFundsException{
		double balance=100;
		if(amount>balance)
			throw new InsufficientFundsException("Insufficient balance");
		else {
			System.out.println("withdraw succes");
		}
	}
	
	public static void main(String[] args) {
		try {
			withdraw(500.00);
		} catch (
				Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
	
	
	

