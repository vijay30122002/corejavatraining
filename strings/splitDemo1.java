package com.evergent.corejava.strings;

public class splitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="java is powerful language";
		String[] word=str1.split(" ");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
	}

}
