package by.epamtc.melnikov.task03.view;

import by.epamtc.melnikov.task03.bean.Array;

public abstract class ConsoleOutput {
	
	public static void printIntArray(Array array) {
		
		if (array != null) {
			
			for (int i = 0; i < array.getPointer(); i++) {
				System.out.print(array.get(i) + " ");
			}
			
		}
		
	}
	
	public static void printIntArray(int[] array) {
		
		if (array != null) {
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
		}
		
	}
	
	public static void printIntJaggedArray(int[][] jaggedArray) {
		
		for (int i = 0; i < jaggedArray.length; i++) {
			
			System.out.print("\n");
			printIntArray(jaggedArray[i]);
			
		}
		
	}
	
	public static void printMessage(String message) {
		
		if (message != null) {
			System.out.println(message);
		}
		
	}
	
}
