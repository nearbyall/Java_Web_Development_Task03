package by.epamtc.melnikov.task03.logic.jagged_array_sort.impl;

import by.epamtc.melnikov.task03.logic.ArrayLogic;
import by.epamtc.melnikov.task03.logic.JaggedArrayLogic;
import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.jagged_array_sort.BubbleSortSwap;

public class DescendingSortByMin implements BubbleSortSwap {

	@Override
	public void bubbleSortSwap(int[][] jaggedArray, int firstIndex, int secondIndex, Boolean isSorted) {

		LogicProvider provider = LogicProvider.getInstance();
		ArrayLogic arrayLogic = provider.getArrayLogic();
		JaggedArrayLogic jaggedArrayLogic = provider.getJaggedArrayLogic();
		
		int firstElement = arrayLogic.findSmallestElement(jaggedArray[firstIndex]);
		int secondElement = arrayLogic.findSmallestElement(jaggedArray[secondIndex]);
		if(firstElement < secondElement){
			isSorted = false;
			jaggedArrayLogic.swap(jaggedArray, firstIndex, secondIndex);
		}
		
	}
	
}