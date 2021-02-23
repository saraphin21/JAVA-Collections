package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class StreamsFilterCollectors {

	
	private StreamsFilterCollectors()
	{
		List<Integer> sorting=new ArrayList<>();
		sorting.add(1);
		sorting.add(2);
		sorting.add(3);
		sorting.add(4);
		sorting.add(5);
		sorting.add(6);
		
	List<Integer> aslist=	sorting.stream().filter(x->x>4).collect(Collectors.toList());
Long count=	sorting.stream().filter(x->x>4).collect(Collectors.counting());
	
	System.out.println("the asList is"+aslist);
	System.out.println("the count is"+count);
	
	}
}
