package by.epamtc.melnikov.task03.logic;

import by.epamtc.melnikov.task03.bean.Array;

public interface ArrayLogic {

	void selectionSort(Array array);
	
	void insertionSort(Array array);
	
	void shellSort(Array array);
	
	int binarySearch(Array array, int key);
	
	int findBiggestElement(Array array);
	
	int findBiggestElement(int[] array);
	
	int findSmallestElement(Array array);
	
	int findSmallestElement(int[] array);
	
	int findSum(Array array);
	
	int findSum(int[] array);
	
}
