package by.epamtc.melnikov.task03.logic.impl;

import by.epamtc.melnikov.task03.logic.JaggedArrayLogic;
import by.epamtc.melnikov.task03.logic.jagged_array_sort.BubbleSortSwap;

public class JaggedArrayLogicImpl implements JaggedArrayLogic {
	
	@Override
	public void sortByParam(int[][] jaggedArray, BubbleSortSwap bubbleSortSwap) {
		
		Boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < jaggedArray.length - 1; i++) {
            	
				bubbleSortSwap.bubbleSortSwap(jaggedArray, i, i + 1, isSorted);
				
			}
		}
	}

	public void swap(int[][] jaggedArray, int firstIndex, int secondIndex) {
		
		int[] temp = jaggedArray[firstIndex];
		jaggedArray[firstIndex] = jaggedArray[secondIndex];
		jaggedArray[secondIndex] = temp;
		
	}

}
