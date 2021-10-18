package by.epamtc.melnikov.task03.logic.impl;

import by.epamtc.melnikov.task03.constant.StringConstants;
import by.epamtc.melnikov.task03.logic.ArrayLogic;
import by.epamtc.melnikov.task03.logic.JaggedArrayLogic;
import by.epamtc.melnikov.task03.logic.LogicProvider;

public class JaggedArrayLogicImpl implements JaggedArrayLogic {
	
	@Override
	public void sortByParam(int[][] jaggedArray, String param) {
		
		LogicProvider provider = LogicProvider.getInstance();
		ArrayLogic arrayLogic = provider.getArrayLogic();
		
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < jaggedArray.length - 1; i++) {
            	
				int firstElement;
				int secondElement;
            	
				switch(param) {
				case StringConstants.ASCENDING_SORT_BY_MAX:
						firstElement = arrayLogic.findBiggestElement(jaggedArray[i]);
						secondElement = arrayLogic.findBiggestElement(jaggedArray[i + 1]);
						if(firstElement > secondElement){
							isSorted = false;
							swap(jaggedArray, i, i + 1);
						}
						break;
            		case StringConstants.ASCENDING_SORT_BY_MIN:
						firstElement = arrayLogic.findSmallestElement(jaggedArray[i]);
						secondElement = arrayLogic.findSmallestElement(jaggedArray[i + 1]);
						if(firstElement > secondElement){
							isSorted = false;
							swap(jaggedArray, i, i + 1);
						}
						break;
					case StringConstants.ASCENDING_SORT_BY_SUM:
						firstElement = arrayLogic.findSum(jaggedArray[i]);
						secondElement = arrayLogic.findSum(jaggedArray[i + 1]);
						if(firstElement > secondElement){
							isSorted = false;
							swap(jaggedArray, i, i + 1);
						}
						break;
					case StringConstants.DESCENDING_SORT_BY_MAX:
						firstElement = arrayLogic.findBiggestElement(jaggedArray[i]);
						secondElement = arrayLogic.findBiggestElement(jaggedArray[i + 1]);
						if(firstElement < secondElement){
							isSorted = false;
							swap(jaggedArray, i, i + 1);
						}
						break;
					case StringConstants.DESCENDING_SORT_BY_MIN:
						firstElement = arrayLogic.findSmallestElement(jaggedArray[i]);
						secondElement = arrayLogic.findSmallestElement(jaggedArray[i + 1]);
						if(firstElement < secondElement){
							isSorted = false;
                            swap(jaggedArray, i, i + 1);
                        }
                		break;
            		case StringConstants.DESCENDING_SORT_BY_SUM:
            			firstElement = arrayLogic.findSum(jaggedArray[i]);
                    	secondElement = arrayLogic.findSum(jaggedArray[i + 1]);
                    	if(firstElement < secondElement){
                            isSorted = false;
                            swap(jaggedArray, i, i + 1);
                    	}
                    	break;
            		default:
            			break;
            	}
            }
        }
	}
	
	private void swap(int[][] jaggedArray, int firstIndex, int secondIndex) {
		
		int[] temp = jaggedArray[firstIndex];
		jaggedArray[firstIndex] = jaggedArray[secondIndex];
		jaggedArray[secondIndex] = temp;
		
	}

}
