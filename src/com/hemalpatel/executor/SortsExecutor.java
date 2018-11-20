package com.hemalpatel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.hemalpatel.base.BaseSortingExecutor;
import com.hemalpatel.sorts.SortAlgorithm;
import com.hemalpatel.sorts.bubblesortandvariants.bubblesort.BubbleSort;
import com.hemalpatel.sorts.bubblesortandvariants.bubblesort.BubbleSortExecutor;

public class SortsExecutor {
		
	public static void executeSorts() {
		List<Integer> data = randomNumberGenerator(1, 1000, 10);
		
		BaseSortingExecutor bubbleSort = new BubbleSortExecutor();
		bubbleSort.execute(data);
		
	}
	
	private static List<Integer> randomNumberGenerator(int min, int max, int count) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for(int loop = 0; loop < count; loop++) {
			list.add(random.nextInt(max) + min);
		}
		return list;
	}
}
