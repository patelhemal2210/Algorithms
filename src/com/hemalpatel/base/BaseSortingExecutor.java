package com.hemalpatel.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.hemalpatel.sorts.SortAlgorithm;
import com.hemalpatel.sorts.bubblesortandvariants.bubblesort.BubbleSort;

public interface BaseSortingExecutor {
	
	public void execute(List<Integer> data);
	public void printTitle();
	public void printFooter();
	
	default void runSortingAlgorithm(SortAlgorithm sortingAlgorithm,List<Integer> data) {
		List<Integer> sortedData = new ArrayList<>();		
		
		printUnsortedList(data);
		
		long startTime = System.nanoTime(); 
		sortedData = sortingAlgorithm.sort();
		long endTime = System.nanoTime();
		
		printSortedList(sortedData);
		timeTaken(startTime, endTime);
	}
	
	default void printUnsortedList(List<Integer> data) {
		printList("Unsorted List: ", data);
	}
	
	default void printSortedList(List<Integer> data) {
		printList("Sorted List: ", data);
	}
	
	default void printList(String message, List<Integer> data) {
		System.out.println(message);
		for(int loop = 0; loop < data.size(); loop++) {
			System.out.print(data.get(loop) + " ");
		}
		System.out.println("\n");
	}
	
	default List<Integer> randomNumberGenerator(int min, int max, int count) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for(int loop = 0; loop < count; loop++) {
			list.add(random.nextInt(max) + min);
		}
		return list;
	}
	
	default void timeTaken(long startTime, long endTime) {
		long timeInMS = TimeUnit.MICROSECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
		System.out.println("Time Taken :\n" + timeInMS + " micro second");
	}

}
