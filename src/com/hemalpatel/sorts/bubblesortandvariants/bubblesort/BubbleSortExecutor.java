package com.hemalpatel.sorts.bubblesortandvariants.bubblesort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.hemalpatel.base.BaseSortingExecutor;

public class BubbleSortExecutor implements BaseSortingExecutor{
	
	@Override
	public void execute(List<Integer> data) {
		
		printTitle();
		BubbleSort sortingAlgorithm = new BubbleSort(data);
		runSortingAlgorithm(sortingAlgorithm, data);
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Bubble Sort Sorting Algorithm -- \n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Bubble Sort Sorting Algorithm --");
		System.out.println("*********************************\n");
	}
}
