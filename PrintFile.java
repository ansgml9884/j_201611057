package com.sd.io;

import java.io.File;
import java.io.FileReader;
import  java.io.FileNotFoundException;

public class PrintFile{
 	public void print() throws FileNotFoundException{
		File f = new File("noname.txt");
		FileReader fr=new FileReader(f);    
	}
	public static void main(String[] args){
		PrintFile pf=new PrintFile();
		try {
			pf.print();
		}catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
	}
} 
