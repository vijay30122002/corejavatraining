package com.evergent.corejava.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file =new File("D:/mydata/myinfo1.txt");
		Scanner scanner =new Scanner(file);
		while(scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
		}
		scanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}

	
	

}}
