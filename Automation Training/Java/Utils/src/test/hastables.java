package test;

import java.util.Hashtable;

public class hastables {

	public static void main(String[] args) {
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("name","pb");
		ht.put("location", "LA");
		ht.put("course", "Selenium");
		
		System.out.println(ht.get("location"));
		
	}
	
	
}
