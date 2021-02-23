package com.collections.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class StringJoinerClass {

	
	private StringJoinerClass()
	{
	
	java.util.StringJoiner joined=new java.util.StringJoiner(" ","*","*");
	joined.add("Hai").add("Welcome");
	
	System.out.println("the StringJoiner is "+joined);
		
	

	
	
	}
	
	
}
