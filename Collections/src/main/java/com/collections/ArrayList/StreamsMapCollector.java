package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class StreamsMapCollector {


private StreamsMapCollector()
{	
	String s1 = "";
StringBuilder sb = new StringBuilder();
	
				List<String> list = new ArrayList<>();
	        list.add("foo");
	        list.add("bar");
	        list.add("baz");
	    String result = 
	 list
	 .stream()
	 .map(s->s1.concat(s+" "))
	.collect(Collectors.joining());
		 System.out.println(result);
		 
	
	      
	    }

}