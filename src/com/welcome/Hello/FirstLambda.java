package com.welcome.Hello;

import java.io.*;


public class FirstLambda {

	public static void main(String []args) {
		

		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		File file = new File("D:/");
		
		File[] files = file.listFiles(fileFilter);
		
		for(File fileValue : files) {
			System.out.println(fileValue.getName());
		}
	}
}
