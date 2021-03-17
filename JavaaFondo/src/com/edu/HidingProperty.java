package com.edu;

public class HidingProperty {
	private static String name1 = "static property";
	private String name2 = "instance property";

	 static final String variable;
	
	static {
		variable = "sd";
	}
	
	
	public void method() {
		String name1 = "local variable";
		System.out.println(name1); // prints: local variable
		var name2 = "local variable"; // prints: local variable
		System.out.println(name2);
		System.out.println(HidingProperty.name1); // prints: static property
		System.out.println(this.name2); // prints: instance property
	}
}
