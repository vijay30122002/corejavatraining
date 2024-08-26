package com.evergent.corejava.strings;

public class splitdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="java is powerful language";
		String[] word=str1.split(" ");
		for(String w:word) {
			System.out.println(w);
		}
	}

}
