package com.collections.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ArrayListIteratorConcept {

	private  ArrayListIteratorConcept()
	{
	List<String> list=new ArrayList<String>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  