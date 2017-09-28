package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing {

	public static void main(String[] args) throws IOException {
	
		//Stream Connectivity
		File f = new File("C:\\write\\mytextfile.txt");
		FileWriter fw = new FileWriter(f,true);//true parameter appends
		BufferedWriter writer = new BufferedWriter(fw);
		
		//writing it overrides what it has
		writer.write("hFirst Line");
		writer.newLine();
		writer.write("PB");
		writer.newLine();
		writer.write("Sprabuddha");
	
		//closing stream
		writer.close();
		
		System.out.println("File created");
	}

}
