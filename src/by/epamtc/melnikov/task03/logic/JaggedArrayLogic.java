package by.epamtc.melnikov.task03.logic;

import by.epamtc.melnikov.task03.logic.jagged_array_sort.BubbleSortSwap;

public interface JaggedArrayLogic {
	
	void sortByParam(int[][] jaggedArray, BubbleSortSwap bubbleSortSwap);
	
	void swap(int[][] jaggedArray, int firstIndex, int secondIndex);
	
}
