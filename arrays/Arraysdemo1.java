package com.evergent.corejava.arrays;

public class Arraysdemo1 {
public static void main(String args[]) {
	int arr[]=new int[5];
	arr[0]=60;
	arr[1]=10;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
