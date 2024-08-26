package com.evergent.corejava.strings;

import java.util.Arrays;

public class StringPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a;
		String b;
		System.out.println('a'+'b');
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		String series=" ";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series=series+ch;
			
		}
		System.out.println(series);
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
			System.out.println(ch);
		}
		String name="java technologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('t'));
		
	}

}
