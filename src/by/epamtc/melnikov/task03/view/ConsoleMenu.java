package by.epamtc.melnikov.task03.view;

import by.epamtc.melnikov.task03.bean.Array;
import by.epamtc.melnikov.task03.constant.StringConstants;
import by.epamtc.melnikov.task03.logic.ArrayLogic;
import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.NumbersLogic;

public abstract class ConsoleMenu {

	public static int enterChoiseArrayMenu() {
		
		System.out.println(StringConstants.ARRAY_MENU);
		
		int choise = 0;
		
		do {
			choise = ConsoleInput.enterInteger();
		} while (choise < 0 || choise > 7); 
		
		
		return choise;
		
	}
	
	public static int enterChoiseJaggedArrayMenu() {
		
		System.out.println(StringConstants.JAGGED_ARRAY_MENU);
		
		int choise = 0;
		
		do {
			choise = ConsoleInput.enterInteger();
		} while (choise < 0 || choise > 6); 
		
		
		return choise;
		
	}
	
	public static int enterChoiseStringMenu() {
		
		System.out.println(StringConstants.STRING_MENU);
		
		int choise = 0;
		
		do {
			choise = ConsoleInput.enterInteger();
		} while (choise < 0 || choise > 5); 
		
		
		return choise;
		
	}
	
	public static void choiseProccesingTask0301(Array array) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		ArrayLogic arrayLogic = logicProvider.getArrayLogic();
		NumbersLogic numbersLogic = logicProvider.getNumbersLogic();
		
		int choise = 0;
		
		do {
			choise = ConsoleMenu.enterChoiseArrayMenu();
			switch (choise) {
				case 1:
					arrayLogic.selectionSort(array);
					ConsoleOutput.printIntArray(array);
					break;
				case 2:
					arrayLogic.insertionSort(array);
					ConsoleOutput.printIntArray(array);
					break;
				case 3:
					arrayLogic.shellSort(array);
					ConsoleOutput.printIntArray(array);
					break;
				case 4:
					ConsoleOutput.printMessage(StringConstants.MAX_ELEMENT + arrayLogic.findBiggestElement(array) +
											   StringConstants.MIN_ELEMENT + arrayLogic.findSmallestElement(array));
					break;
				case 5:
					ConsoleOutput.printMessage(StringConstants.PRIME_NUMBERS);
					ConsoleOutput.printIntArray(numbersLogic.findPrimeNumbers(array.getArray()));
					break;
				case 6:
					ConsoleOutput.printMessage(StringConstants.FIBONACCI_NUMBERS);
					ConsoleOutput.printIntArray(numbersLogic.findFibonacciNumbers(array.getArray()));
					break;
				case 7:
					ConsoleOutput.printMessage(StringConstants.UNIQUE_THREE_DIGIT_NUMBERS);
					ConsoleOutput.printIntArray(numbersLogic.findUniqueNumbers(numbersLogic.findThreeDigitNumbers(array.getArray())));
					break;	
			}
		} while (choise != 0);
	}
	
}
