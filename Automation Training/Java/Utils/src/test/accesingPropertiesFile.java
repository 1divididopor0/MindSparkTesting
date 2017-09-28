package test;

import java.io.*;
import java.util.Properties;

public class accesingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		prop.load(f);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(System.getProperty("user.dir"));
	}

}
