package by.epamtc.melnikov.task03.view;

import by.epamtc.melnikov.task03.bean.Array;
import by.epamtc.melnikov.task03.constant.StringConstants;
import by.epamtc.melnikov.task03.logic.ArrayLogic;
import by.epamtc.melnikov.task03.logic.JaggedArrayLogic;
import by.epamtc.melnikov.task03.logic.LogicProvider;
import by.epamtc.melnikov.task03.logic.NumbersLogic;
import by.epamtc.melnikov.task03.logic.StringLogic;
import by.epamtc.melnikov.task03.logic.jagged_array_sort.impl.*;

public abstract class ConsoleMenu {

	public static int enterChoiseArrayMenu() {
		
		System.out.println(StringConstants.ARRAY_MENU);
		
		int choise = ConsoleInput.enterChoiseTask0301();
		
		return choise;
		
	}
	
	public static int enterChoiseJaggedArrayMenu() {
		
		System.out.println(StringConstants.JAGGED_ARRAY_MENU);
		
		int choise = ConsoleInput.enterChoiseTask0302();
		
		return choise;
		
	}
	
	public static int enterChoiseStringMenu() {
		
		System.out.println(StringConstants.STRING_MENU);
		
		int choise = ConsoleInput.enterChoiseTask0303();
		
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
	
	public static void choiseProccesingTask0302(int[][] jaggedArray) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		JaggedArrayLogic jaggedArrayLogic = logicProvider.getJaggedArrayLogic();
		
		int choise = 0;
		
		do {
			choise = ConsoleMenu.enterChoiseJaggedArrayMenu();
			switch (choise) {
				case 1:
					jaggedArrayLogic.sortByParam(jaggedArray, new AscendingSortByMax());
					ConsoleOutput.printIntJaggedArray(jaggedArray);
					break;
				case 2:
					jaggedArrayLogic.sortByParam(jaggedArray, new AscendingSortByMin());
					ConsoleOutput.printIntJaggedArray(jaggedArray);
					break;
				case 3:
					jaggedArrayLogic.sortByParam(jaggedArray, new AscendingSortBySum());
					ConsoleOutput.printIntJaggedArray(jaggedArray);
					break;
				case 4:
					jaggedArrayLogic.sortByParam(jaggedArray, new DescendingSortByMax());
					ConsoleOutput.printIntJaggedArray(jaggedArray);
					break;
				case 5:
					jaggedArrayLogic.sortByParam(jaggedArray, new DescendingSortByMin());
					ConsoleOutput.printIntJaggedArray(jaggedArray);
					break;
				case 6:
					jaggedArrayLogic.sortByParam(jaggedArray, new DescendingSortBySum());
					ConsoleOutput.printIntJaggedArray(jaggedArray);
					break;
			}
		} while (choise != 0);
		
	}
	
	public static void choiseProccesingTask0303(String text) {
		
		LogicProvider logicProvider = LogicProvider.getInstance();
		StringLogic stringLogic = logicProvider.getStringLogic();
		
		int choise = 0;
		
		do {
			choise = ConsoleMenu.enterChoiseStringMenu();
			switch (choise) {
				case 1:
					ConsoleOutput.printMessage(StringConstants.ENTER_CHARACTER);
					char symbol = ConsoleInput.enterCharacter();
					ConsoleOutput.printMessage(StringConstants.ENTER_INDEX);
					int k = ConsoleInput.enterInteger();
					ConsoleOutput.printMessage(stringLogic.replaseSymbol(text, k, symbol));
					break;
				case 2:
					ConsoleOutput.printMessage(StringConstants.ENTER_STRING);
					ConsoleOutput.printMessage(stringLogic.correctWord(ConsoleInput.enterString()));
					break;
				case 3:
					ConsoleOutput.printMessage(StringConstants.ENTER_INTEGER);
					int firstLength = ConsoleInput.enterPositiveInteger();
					ConsoleOutput.printMessage(StringConstants.ENTER_STRING);
					String substring = ConsoleInput.enterString();
					ConsoleOutput.printMessage(stringLogic.replaceWordsWithSubstring(text, substring, firstLength));
					break;
				case 4:
					ConsoleOutput.printMessage(stringLogic.addSpaces(stringLogic.removeUnnecessaryCharacters(text)));
					break;
				case 5:
					ConsoleOutput.printMessage(StringConstants.ENTER_INTEGER);
					int secondLength = ConsoleInput.enterPositiveInteger();
					ConsoleOutput.printMessage(stringLogic.removeConsonantWords(text, secondLength));
					break;
			}
		} while (choise != 0);
		
	}
		
}
