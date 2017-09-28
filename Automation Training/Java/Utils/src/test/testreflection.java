package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testreflection {
	
	public static void main (String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	String x = "click";
	
	Method method = testreflection.class.getMethod(x, String.class);
	method.invoke(method,"Hi there");
	}

public static void click(String x) {
	System.out.println("executing"+ x);
}

}