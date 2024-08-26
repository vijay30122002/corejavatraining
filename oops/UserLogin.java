package com.evergent.corejava.oops;

public class UserLogin {

	public void loginData() {
		System.out.println("login info");
	}
	public void loginData(String uname,String pass) {
		System.out.println("uname is "+uname);
		System.out.println("pass is "+pass);
	}
	public void loginData(String uname,String pass,String captcha) {
		System.out.println("uname is"+uname);
		System.out.println("pass is"+pass);

		System.out.println("captcha is"+captcha);

	}
	public void loginData(String pass,int mobile) {
		System.out.println("mobile is"+mobile);
		System.out.println("pass is"+pass);

	}
	public void show() {
		System.out.println("show method");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserLogin login=new UserLogin();
		login.loginData();
		login.loginData("vijay","kumar");
		login.loginData("kiran","kumari","abc");
		login.loginData("durga",966646483);
		login.loginData();
	}

}
