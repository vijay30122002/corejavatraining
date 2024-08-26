package com.evergent.corejava.strings;



public class contain_substring {

	public static void main(String args[]) {
		String string="the quick fox jumps over the lazy dog";
		String subString="fox";
		boolean contains=string.contains(subString);
		System.out.println("contains"+subString+": "+contains);
	}
}
