package by.epamtc.melnikov.task03.logic.impl;

import by.epamtc.melnikov.task03.bean.Array;
import by.epamtc.melnikov.task03.logic.ArrayLogic;

public class ArrayLogicImpl implements ArrayLogic {
	
	@Override
	public void selectionSort(Array array) {
		
		for (int i = 0; i < array.getPointer(); i++) {
			
            int pos = i;
            int min = array.get(i);
            
            for (int j = i + 1; j < array.getPointer(); j++) {
                if (array.get(j) < min) {
                    pos = j;
                    min = array.get(j);
                }
            }
            
            array.set(pos, array.get(i));
            array.set(i, min);
            
        }
		
	}

	@Override
	public void insertionSort(Array array) {
		
		for (int left = 0; left < array.getPointer(); left++) {
			
			int value = array.get(left);
			
			int i = left - 1;
			for (; i >= 0; i--) {
				
				if (value < array.get(i)) {
					array.set(i + 1, array.get(i));
				} else {
					
					break;
				}
			}
			
			array.set(i + 1, value);
		}
		
	}

	@Override
	public void shellSort(Array array) {

		
		int gap = array.getPointer() / 2;
		
		while (gap >= 1) {
			
		    for (int right = 0; right < array.getPointer(); right++) {

		       for (int c = right - gap; c >= 0; c -= gap) {
		           if (array.get(c) > array.get(c + gap)) {
		               array.swap(c, c + gap);
		           }
		       }
		       
		    }
		    
		    gap = gap / 2;
		}
		
	}

	@Override
	public int binarySearch(Array sortedArray, int key) {
		
		int firstIndex = 0;
	    int lastIndex = sortedArray.getPointer() - 1;
	    
	    while(firstIndex <= lastIndex) {
	    	
	        int middleIndex = (firstIndex + lastIndex) / 2;
	        
	        if (sortedArray.get(middleIndex) == key) {
	            return middleIndex;
	        } else if (sortedArray.get(middleIndex) < key) {
	        	firstIndex = middleIndex + 1;
	        } else if (sortedArray.get(middleIndex) > key) {
	        	lastIndex = middleIndex - 1;
	        }	            

	    }
	    
	    return -1;

	}

	@Override
	public int findBiggestElementIndex(Array array) {
		
		int biggestElement = array.get(0);

		for (int i = 0; i < array.getPointer(); i++) {
			if (array.get(i) > biggestElement) {
				biggestElement = array.get(i);
			}
		}
		
		return biggestElement;
		
	}

	@Override
	public int findSmallestElementIndex(Array array) {
		
		int smallestElement = array.get(0);

		for (int i = 0; i < array.getPointer(); i++) {
			if (array.get(i) > smallestElement) {
				smallestElement = array.get(i);
			}
		}
		
		return smallestElement;

	}

}
