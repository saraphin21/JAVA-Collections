package com.collections.ArrayList;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;
@Component
public class ParallelArraySort {
	private ParallelArraySort()
	{
		
		
		List<Integer> arrParallelSortedList;
		int arr[]= {2,3,8,9,4,5};
		
		
		System.out.println("the sequential sort start time is"+LocalDateTime.now());
		Arrays.sort(arr);
		System.out.println("the sequential sort end time is"+LocalDateTime.now());
		
		System.out.println("the parallel sort start time is"+LocalDateTime.now());
		Arrays.parallelSort(arr);
		System.out.println("the parallel sort end time is"+LocalDateTime.now());
		
		arrParallelSortedList = IntStream.of( arr ).boxed().collect( Collectors.toList() );
		
		
		//arrParallelSortedList=new ArrayList(Arrays.asList(arr));
		
		
		System.out.println("the arrParallelSortedList"+arrParallelSortedList);
		
		arrParallelSortedList.forEach(x->System.out.println(x));
		
	}

}
