package test;

import java.util.Hashtable;

public class hasinsidehas {
	public static void main(String[] args) {
		Hashtable<String,String> ht1 = new Hashtable<String,String>();
		ht1.put("Course1", "Selenium");
		ht1.put("Course2", "QTP");
		
		Hashtable<String,String> ht2 = new Hashtable<String,String>();
		ht2.put("location1", "LA");
		ht2.put("location2", "Santa");
		
		Hashtable<String,Hashtable<String,String>> ht3 = new Hashtable<String,Hashtable<String,String>>();
		ht3.put("institute", ht1);
		ht3.put("country", ht2);
		
		System.out.println(ht3.get("institute").get("Course1"));
		System.out.println(ht3.get("country").get("location1"));
	}

}
