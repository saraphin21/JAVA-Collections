package com.collections.Map;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class HashMap {

	private  HashMap(){
		
	System.out.println("inside the hashmap");
	Map<Integer, String> hmap= new java.util.HashMap<Integer, String>();
	hmap.put(0, "sweeta");
	hmap.put(1, "suganthi");
	
	

	
	
	
	
	for(Map.Entry<Integer, String> h:hmap.entrySet())
	{
		System.out.println("the traditional hash map keys are"+h.getKey()+"the values are"+h.getValue());
	}
	
	
	Map<Integer, String> result=hmap.entrySet().stream().filter(map -> map.getKey().intValue()==0).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
		System.out.println("the result is "+result);
		Map<Integer, String> result1=hmap.entrySet().stream().collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
		System.out.println("the result is "+result1);
	
	
	//.forEach((k,v)-> System.out.println("the keys are" + k+"the values are"+v));
	
		
	}
}
