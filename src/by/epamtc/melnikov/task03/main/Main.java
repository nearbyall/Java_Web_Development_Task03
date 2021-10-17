package by.epamtc.melnikov.task03.main;

import by.epamtc.melnikov.task03.bean.Array;
import by.epamtc.melnikov.task03.constant.StringConstants;
import by.epamtc.melnikov.task03.logic.ArrayLogic;
import by.epamtc.melnikov.task03.logic.JaggedArrayLogic;
import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.NumbersLogic;
import by.epamtc.melnikov.task03.view.ConsoleInput;
import by.epamtc.melnikov.task03.view.ConsoleOutput;
import by.epamtc.melnikov.task03.view.ConsoleProvider;

public class Main {
	
	public static void main(String[] args) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		
		ArrayLogic arrayLogic = logicProvider.getArrayLogic();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		JaggedArrayLogic jaggedArrayLogic = logicProvider.getJaggedArrayLogic();
		
		ConsoleProvider consoleProvider = ConsoleProvider.getInstance();
		
		ConsoleInput consoleInput = consoleProvider.getConsoleInput();
		ConsoleOutput consoleOutput = consoleProvider.getConsoleOutput();
		
		int[][] jaggedArray = new int[5][];
		jaggedArray[0] = new int[]{1, 5, -99, 2, 123, 43};
		jaggedArray[1] = new int[]{1234, 5, -2, 2, 123};
		jaggedArray[2] = new int[]{1, -17, -19, 2, 355, 43};
		jaggedArray[3] = new int[]{1, 5, -1, 2};
		jaggedArray[4] = new int[]{1, 5, -99, 2, 123, 43, 999, 23499};
		
		jaggedArrayLogic.sortByParam(jaggedArray, StringConstants.ASCENDING_SORT_BY_MAX);
		
		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(" " + jaggedArray[i][j]);
			}
			System.out.println("\n");
		}
		
		
		Array array = new Array();
		array.add(5);
		array.add(-9);
		array.add(3);
		array.add(144);
		array.add(99);
		array.add(-99);
		array.add(125);
		array.add(53);
		array.add(55);
		
		arrayLogic.shellSort(array);
		
		int[] numbers = array.getArray();
		int[] numbers1 = numbersLogic.findThreeDigitNumbers(numbers);
		
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}
		
		System.out.println("Asdasd" + arrayLogic.findSum(array));
		
	}
	
	public static void runTask0301() {
		
	}
	
	public static void runTask0302() {
		
	}
	
	public static void runTask0303() {
		
	}
	
}
