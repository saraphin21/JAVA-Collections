package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ArrayListForEachConcept {

	private ArrayListForEachConcept()
{
   List<String> namelist=new ArrayList<>();
   namelist.add("sweeta");
   namelist.add("suganthi");
   namelist.add("hirudayaraj");
   namelist.add("sujitha");
   
   
   namelist.forEach(names->System.out.println("the names are    "+names));
   
  
}
}
