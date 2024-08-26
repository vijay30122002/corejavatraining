package com.evergent.corejava.strings;

public class stringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		sb.append("beautiful");
		System.out.println(sb);
		sb.insert(5, "hi");
		System.out.println(sb);
		sb.replace(0, 5, "watsup");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
