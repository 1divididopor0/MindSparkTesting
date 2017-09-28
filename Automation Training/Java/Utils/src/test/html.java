package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class html {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File("C:\\write\\mytextfile.html");
		FileWriter fw = new FileWriter(f,true);//true parameter appends
		BufferedWriter writer = new BufferedWriter(fw);
		
		//writing it overrides what it has
		writer.write("<html> <body> <title>Wayto automation</title><h1>learning<h1/></title></body></html>");
	
	
		//closing stream
		writer.close();
		
		System.out.println("File created");
	}


	
}
