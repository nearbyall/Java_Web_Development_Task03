package by.epamtc.melnikov.task03.logic;

import by.epamtc.melnikov.task03.bean.Array;

public interface ArrayLogic {

	public void selectionSort(Array array);
	
	public void insertionSort(Array array);
	
	public void shellSort(Array array);
	
	public int binarySearch(Array array, int key);
	
	public int findBiggestElementIndex(Array array);
	
	public int findSmallestElementIndex(Array array);
	
}
