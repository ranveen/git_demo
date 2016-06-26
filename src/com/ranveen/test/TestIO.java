package com.ranveen.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIO {
	public static void main(String[] args) {
		try {
			FileInputStream is =new FileInputStream("D://hehe.txt");
			byte[] bytes = new byte[1024];
			int hasRead=0;
			while((hasRead=is.read(bytes))>0){
				System.out.println(new String(bytes,0,hasRead));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
