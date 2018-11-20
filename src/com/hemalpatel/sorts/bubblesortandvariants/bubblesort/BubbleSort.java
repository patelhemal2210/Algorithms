package com.hemalpatel.sorts.bubblesortandvariants.bubblesort;

import java.util.List;

import com.hemalpatel.sorts.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {

	private List<Integer> data;
	
	public BubbleSort(List<Integer> data) {
		this.data = data;
	}
	
	@Override
	public List<Integer> sort() {
		
		int start = 0;
		int end = data.size() - 1;
		int tempVar = 0;
		for(int outer = end; outer > 0; outer--) {
			for(int inner = start; inner < end - 1; inner++) {
				if(data.get(inner) > data.get(inner + 1)) {
					tempVar = data.get(inner);
					data.set(inner, data.get(inner + 1));
					data.set(inner + 1, tempVar);
				}
			}
		}
		return data;
	}
}
