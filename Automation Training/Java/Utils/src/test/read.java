package test;

import java.io.*;

public class read {
	
public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File("C:\\write\\mytextfile.txt");
		FileReader fr = new FileReader(f);//true parameter appends
		BufferedReader reader = new BufferedReader(fr);
		
		//reading
		while (reader.readLine()!=null) {
		
		System.out.println(reader.readLine());
		}
		
		
		//closing stream
		reader.close();
		
		System.out.println("File created");
	}


}
